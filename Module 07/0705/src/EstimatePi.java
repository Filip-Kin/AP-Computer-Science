import java.util.Scanner;

/**
 * Author: Filip Kin
 * Version: 2019-11-20
 * Description: Estimate pi by throwing darts at a circle
 */

public class EstimatePi {
    public static void main(String[] args) {
        int[] in = input();
        double total = 0;

        for (int i = 0; i < in[1]; i++) {
            double pi = trial(in[0])*4;
            total += pi;
            System.out.print("Trial "+(i+1)+" pi = ");
            System.out.printf("%.8f%n", pi);
        }

        System.out.println("Estimate of pi = ");
        System.out.printf("%.8f%n", total/in[1]);
    }

    /**
     * Gets input from user
     * @return  {a,b} a is number of darts per trial, b is number of trials
     */
    private static int[] input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of dart throws per trial: ");
        int a = Integer.parseInt(in.nextLine());
        System.out.print("Input number of trials: ");
        int b = Integer.parseInt(in.nextLine());
        return new int[] {a,b};
    }

    /**
     * Simulates a single trial
     * @param thrown    Number of darts per trial
     * @return          Percentage of darts in circle
     */
    private static double trial(int thrown) {
        int hits = 0;
        for(int i = 0; i < thrown; i++) {
            if (dartThrow()) hits++;
        }
        return (double) hits/thrown;
    }

    /**
     * Simulates a single throw
     * @return  True if throw landed in circle
     */
    private static boolean dartThrow() {
        // If I'm not blindfolded there's probably only a 35% chance my dart will hit the square
        // So without vision that drops to like 10%, but its a perfect world where bugs don't exist
        // Also, assuming that landing ON the border counts
        // but the probability of randomly drawing exactly 1.0  here is too low to care
        return (Math.sqrt(Math.pow(Math.random(), 2) + Math.pow(Math.random(), 2)) <= 1);
    }
}
