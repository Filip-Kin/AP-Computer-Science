import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Author: Filip Kin
 * Version: 2019-11-20
 * Description: Calculate the users weight on the different planets
 */

public class PlanetWeight {
    public static void main(String[] args) throws FileNotFoundException {
        String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        double[] g = readData();
        double w = getUserWeight();
        double[] rw = new double[8];
        for (int i = 0; i < names.length; i++) {
            rw[i] = realWeight(w, g[i]);
        }
        output(names, g, rw);
    }

    private static double[] readData() throws FileNotFoundException {
        Scanner in = new Scanner(new File("output.txt"));
        double[] arr = new double[8];
        int i = 0;
        while (in.hasNext()) {
            arr[i] = Double.parseDouble(in.nextLine());
            i++;
        }
        return arr;
    }

    private static double getUserWeight() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your weight(lbs): ");
        return Double.parseDouble(in.nextLine())*453.59237;
    }

    /**
     * Calculate the weight on a planet based on weight on earth and acceleration due to gravity
     * @param w Weight on earth in grams
     * @param g Acceleration due to gravity in m/s^2
     * @return  Weight on planet in pounds
     */
    private static double realWeight(double w, double g) {
        return w*(g/9.8)/453.59237;
    }

    private static void output(String[] p, double[] g, double[]w) {
        System.out.println("       My Weight on the Planets" +
                "\n   Planet  Gravity(m/s^2)  Weight(lb)\n" +
                "----------------------------------------");
        for (int i = 0; i < p.length; i++) {
            System.out.printf("   %-10s", p[i]);
            System.out.printf("%7.2f", g[i]);
            System.out.printf("%14.2f%n", w[i]);
        }
    }
}
