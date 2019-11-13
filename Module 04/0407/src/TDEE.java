/**
 * - Purpose: Calculate the user's TDEE
 * - Version: 2019-11-08
 * - Author: Filip Kin
 */

import java.util.Scanner;

public class TDEE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the following information\nFirst and last name: ");
        String name = in.nextLine();
        System.out.print("Gender: ");
        String gender = in.nextLine();
        boolean male = gender.substring(0, 1).equalsIgnoreCase("M");
        System.out.print("BMR: ");
        int bmr = Integer.parseInt(in.nextLine());

        System.out.println("Select your activity level\n" +
                "[A] Resting (Sleeping/Reclining)\n" +
                "[B] Sedentary (Minimal Movement)\n" +
                "[C] Light (Sitting, Standing)\n" +
                "[D] Moderate (Light manual labor, Riding a bike)\n" +
                "[E] Very Active (Team Sports, Manual labor)\n" +
                "[F] Extremely Active (Full time athlete, Heavy manual labor)\n");

        boolean c = false;
        double aF = 1.0;
        while (!c) {
            System.out.print("Enter the letter corresponding to your activity level: ");
            String aL = in.nextLine().substring(0, 1).toUpperCase(); // Could have done .equalsIgnoreCase but this makes the ifs look cleaner

            c = true;
            if (aL.equals("B")) {
                aF = 1.3;
            } else if (aL.equals("C") && male) {
                aF = 1.6;
            } else if (aL.equals("C")) {
                aF = 1.5;
            } else if (aL.equals("D") && male) {
                aF = 1.7;
            } else if (aL.equals("D")) {
                aF = 1.6;
            } else if (aL.equals("E") && male) {
                aF = 2.1;
            } else if (aL.equals("E")) {
                aF = 1.9;
            } else if (aL.equals("F") && male) {
                aF = 2.4;
            } else if (aL.equals("F")) {
                aF = 2.2;
            } else if (!aL.equals("A")){
                c = false;
                System.out.println("'"+aL+"' is not a valid selection");
            }
        }

        double tdee = bmr*aF;
        System.out.println("\nYour results:\n" +
                "Name: "+name+"\n" +
                "Gender: "+gender+"\n" +
                "BMR: "+bmr+" kcal/day\n" +
                "Activity Factor: "+aF+"\n" +
                "TDEE: "+tdee+" kcal/day");
    }
}
