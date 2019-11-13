/*
 * Purpose: Parse Hurricane Data from a file
 * Author: Filip Kin
 * Version: 2019-11-11
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HurricaneSelector {
    public static void main(String[] args) throws IOException {
        File dataFile = new File("HurricaneData.txt");
        Scanner d = new Scanner(dataFile);

        // First count lines
        int len = 0;
        while (d.hasNext()) {
            d.nextLine();
            len++;
        }

        // Init them arrays
        int[] ny = new int[len];
        int[] np = new int[len];
        double[] nw = new double[len];
        String[] nn = new String[len];

        // Fill them arrays (after reseting the cursor)
        d.close();
        d = new Scanner(dataFile);
        int i = 0;
        while (d.hasNext()) {
            String[] s = d.nextLine().split("\t");
            //System.out.println(Arrays.toString(s));
            ny[i] = Integer.parseInt(s[0]);
            np[i] = Integer.parseInt(s[2]);
            nw[i] = Double.parseDouble(s[3]);
            nn[i] = s[4];
            i++;
        }
        d.close();

        /*
        System.out.println(Arrays.toString(ny));
        System.out.println(Arrays.toString(np));
        System.out.println(Arrays.toString(nw));
        System.out.println(Arrays.toString(nn));
        */

        int[] r = getRange(ny);
        int dp = 0; // Figure out how many data points are in the range
        for (i = 0; i<ny.length; i++) {
            if (ny[i] > r[0] && ny[i] < r[1]) {
                dp++;
            }
        }

        // New arrays only including data points within range
        int[] y = new int[dp];
        double[] p = new double[dp];
        double[] w = new double[dp];
        String[] n = new String[dp];

        // Remove data points outside of range
        int ni = 0;
        for (i = 0; i<ny.length; i++) {
            if (ny[i]>r[0]&&ny[i]<r[1]) {
                y[ni] = ny[i];
                p[ni] = np[i];
                w[ni] = nw[i];
                n[ni] = nn[i];
                ni++;
            }
        }
        
        w = convertWindSpeed(w);
        double[] c = assignCategories(w);

        File outFile = new File("ParsedHurricaneData.txt");
        FileWriter out = new FileWriter(outFile);
        out.write("Data Range: "+r[0]+" - "+r[1]+"\n");

        // Print main section
        System.out.println("\n\n\t\t\t\t\tHurricanes "+r[0]+" - "+r[1]);
        System.out.println("Year\tHurricane\tCategory\tPressure (mb)\tWind Speed (mph)");
        System.out.println("================================================================");
        for (i = 0; i<y.length; i++) {
            System.out.printf("%-8s", y[i]);
            System.out.printf("%-15s", n[i]);
            System.out.printf("%-13d", (int) c[i]);
            System.out.printf("%-16d", (int) p[i]);
            System.out.printf("%8.2f%n", w[i]);
            out.write(y[i]+"\t"+n[i]+"\t"+(int) c[i]+"\t"+(int) p[i]+"\t"+(double) Math.round(w[i]*100)/100+"\n");
        }
        System.out.println("================================================================");

        double[] cS = statistics(c);
        double[] pS = statistics(p);
        double[] wS = statistics(w);

        //Print statistics
        System.out.printf("%23s", "Average: ");
        System.out.printf("%-7.1f", cS[2]);
        System.out.printf("%11.1f", pS[2]);
        System.out.printf("%19.2f%n", wS[2]);

        System.out.printf("%23s", "Minimum: ");
        System.out.printf("%-7d", (int) cS[0]);
        System.out.printf("%9d", (int) pS[0]);
        System.out.printf("%21.2f%n", wS[0]);

        System.out.printf("%23s", "Maximum: ");
        System.out.printf("%-7d", (int) cS[1]);
        System.out.printf("%9d", (int) pS[1]);
        System.out.printf("%21.2f%n", wS[1]);

        // Print catergory counts
        int[] counts = count(c);
        System.out.println("\nSummary of Categories:");
        System.out.printf("Cat 1:%3d%n", counts[0]);
        System.out.printf("Cat 2:%3d%n", counts[1]);
        System.out.printf("Cat 3:%3d%n", counts[2]);
        System.out.printf("Cat 4:%3d%n", counts[3]);
        System.out.printf("Cat 5:%3d", counts[4]);
        out.write("\nSummary of Categories:" +
                "\nCat 1: "+counts[0]+
                "\nCat 2: "+counts[1]+
                "\nCat 3: "+counts[2]+
                "\nCat 4: "+counts[3]+
                "\nCat 5: "+counts[4]);
        out.close();
    }

    private static int[] count(double[] c) {
        int[] counts = new int[]{0, 0, 0, 0, 0};
        for (double v:c) {
            counts[(int) v-1]++;
        }
        return counts;
    }

    private static double[] statistics(double[] arr) {
        double min = arr[0], max = arr[0], total = 0;
        for (double v:arr) {
            total += v;
            if (v<min) {
                min = v;
            }
            if (v>max) {
                max = v;
            }
        }
        // {min, max, avg, total}
        return new double[] {min, max, total/arr.length, total};
    }

    private static double[] convertWindSpeed(double[] w) {
        for (int i = 0; i < w.length; i++) w[i] = w[i] * 1.151;
        return w;
    }

    private static double[] assignCategories(double[] w) {
        double[] c = new double[w.length];
        int i = 0;
        for (double s:w) {
            if (s<96) {
                c[i] = 1;
            } else if (s<111) {
                c[i] = 2;
            } else if (s<130) {
                c[i] = 3;
            } else if (s<157) {
                c[i] = 4;
            } else {
                c[i] = 5;
            }
            i++;
        }
        return c;
    }

    private static int[] getRange(int[] y) {
        Scanner in = new Scanner(System.in);
        int upper, lower;
        while (true) {
            System.out.print("Please enter a range of years (1995 - 2015): ");
            String[] rangeString = in.nextLine().replace(" ", "").split("-");
            lower = Integer.parseInt(rangeString[0])-1;
            upper = Integer.parseInt(rangeString[1])+1; // +- 1 to be inclusive

            // if lower isn't actually lower, switch them
            if (lower>upper) {
                int a = lower;
                lower = upper;
                upper = a;
            }

            if (lower+1<y[0]) {
                System.out.println("We do not have data for hurricanes before "+y[0]);
            } else if (upper-1>y[y.length-1]) {
                System.out.println("We do not have data for hurricanes after "+y[y.length-1]);
            } else {
                in.close();
                return new int[] {lower, upper};
            }
        }
    }
}
