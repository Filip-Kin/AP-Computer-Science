import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Author: Filip Kin
 * Version: 2019-11-20
 * Description: Calculate the acceleration due to gravity of planets
 */

public class PlanetGravity {
    public static void main(String[] args) throws IOException {
        String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        double[] diameter = {4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532};
        double[] mass = {3.30e23, 4.869e24, 5.972e24, 6.4219e23, 1.900e27, 5.68e26, 8.683e25, 1.0247e26};
        double[] accelerations = new double[names.length];

        for (int i = 0; i < names.length; i++) {
            accelerations[i] = gravitationalForce(diameter[i]*500, mass[i]);
        }

        output(names, diameter, mass, accelerations);
        outputToFile(accelerations);
    }

    /**
     * Returns the acceleration due to gravity of an object
     * @param   d   Diameter of the object in meters
     * @param   m   Mass of the object in kilograms
     * @return      Acceleration due to gravity of an object
     */
    private static double gravitationalForce(double d, double m) {
        // Universal Gravitational Constant
        double g = 6.67e-11;
        return (g*m)/Math.pow(d, 2);
    }

    /**
     * Prints out the arrays in neat orderly columns
     * @param   p   Array of names of the objects
     * @param   d   Array of diameters of the objects in kilometers
     * @param   m   Array of masses of the objects in kilograms
     * @param   g   Array of accelerations of the objects in m/s^2
     */
    private static void output(String[] p, double[] d, double[] m, double[] g) {
        System.out.println("                 Planetary Data" +
                "\n   Planet       Diameter(km)  Mass(kg)  g(m/s^2)\n" +
                "-------------------------------------------------");
        for (int i = 0; i < p.length; i++) {
            System.out.printf("   %-10s", p[i]);
            System.out.printf("%10.0f", d[i]);
            System.out.printf("%15.2e", m[i]);
            System.out.printf("%8.2f%n", g[i]);
        }
    }

    /**
     * Prints out the arrays to a file
     * @param   g   Array of accelerations of the objects in m/s^2
     */
    private static void outputToFile(double[] g) throws IOException {
        File out = new File("output.txt");
        FileWriter writer = new FileWriter(out);
        for (double i : g) {
            writer.write(Double.toString(i)+"\n");
        }
        writer.close();
    }
}
