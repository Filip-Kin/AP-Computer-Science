/**
 * Description: Calculate BMI based on user input, then classify the BMI
 * Version: 2019-10-24
 * Author: Filip Kin
 */

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter your name (first last): ");
        String name = s.nextLine();
        System.out.print("Enter your weight in lbs (eg. 125): ");
        String weight = s.nextLine();
        System.out.print("Enter your height in feet and inches (eg. 6 0): ");
        String height = s.nextLine();

        int lbs = Integer.parseInt(weight);
        int in = Integer.parseInt(height.substring(0, 1))*12 + Integer.parseInt(height.substring(2));

        double kgs = lbs / 2.205;
        double m = in / 39.37;

        double bmi = kgs / (m*m);

        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25) {
            category = "Healthy";
        } else if (bmi < 30) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        System.out.println("Body Mass Index Calculator\n====================");
        System.out.println("Name: "+name);
        System.out.println("Height (m): "+m);
        System.out.println("Weight (kg): "+kgs);
        System.out.println("BMI: "+bmi);
        System.out.println("Category: "+category);
    }
}
