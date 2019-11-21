import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @purpose Hurricane data parser, now OOP
 * @author Filip Kin
 * @version 2019-11-21
 */

public class HurricaneSelectorV2 {
    public static void main(String[] args) throws IOException {
        File dataFile = new File("HurricaneDataV2.txt");
        Scanner d = new Scanner(dataFile);

        ArrayList<Hurricane> harr = new ArrayList<Hurricane>();

        int[] yr = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        int i = 0;
        while (d.hasNext()) {
            String[] s = d.nextLine().split("\t");
            int y = Integer.parseInt(s[0]);
            int p = Integer.parseInt(s[2]);
            double w = Double.parseDouble(s[3]);
            Hurricane h = new Hurricane(y, p, w, s[4]);
            h.convertWindSpeed();
            h.assignCategory();
            harr.add(h);
            if (y < yr[0]) yr[0] = y;
            if (y > yr[1]) yr[1] = y;
            i++;
        }
        d.close();

        int[] r = getRange(yr);

        // Arrays for easier statistics
        double[] c = new double[harr.size()];
        double[] p = new double[harr.size()];
        double[] w = new double[harr.size()];

        File outFile = new File("ParsedHurricaneDataV2.txt");
        FileWriter out = new FileWriter(outFile);
        out.write("Data Range: "+r[0]+" - "+r[1]+"\n");

        // Print main section
        System.out.println("\n\n\t\t\t\t\tHurricanes "+r[0]+" - "+r[1]);
        System.out.println("Year\tHurricane\tCategory\tPressure (mb)\tWind Speed (mph)");
        System.out.println("================================================================");
        for (i = 0; i<harr.size(); i++) {
            Hurricane h = harr.get(i);
            if (h.getYear() >= r[0] && h.getYear() <= r[1]) {
                System.out.printf("%-8s", h.getYear());
                System.out.printf("%-15s", h.getName());
                System.out.printf("%-13d", h.getCategory());
                System.out.printf("%-16d", h.getPressure());
                System.out.printf("%8.2f%n", h.getWindSpeed());
                c[i] = h.getCategory();
                p[i] = h.getPressure();
                w[i] = h.getWindSpeed();
                out.write(h.getYear()+"\t"+h.getName()+"\t"+(int) c[i]+"\t"+(int) p[i]+"\t"+(double) Math.round(w[i]*100)/100+"\n");
            }
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

        // Print category counts
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

    private static int[] getRange(int[] y) {
        Scanner in = new Scanner(System.in);
        int upper, lower;
        while (true) {
            System.out.print("Please enter a range of years (1995 - 2015): ");
            String[] rangeString = in.nextLine().replace(" ", "").split("-");
            lower = Integer.parseInt(rangeString[0]);
            upper = Integer.parseInt(rangeString[1]);

            // if lower isn't actually lower, switch them
            if (lower>upper) {
                int a = lower;
                lower = upper;
                upper = a;
            }

            if (lower+1<y[0]) {
                System.out.println("We do not have data for hurricanes before "+y[0]);
            } else if (upper-1>y[1]) {
                System.out.println("We do not have data for hurricanes after "+y[y.length-1]);
            } else {
                in.close();
                return new int[] {lower, upper};
            }
        }
    }
}
