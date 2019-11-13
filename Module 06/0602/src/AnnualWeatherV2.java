/**
 * Annual Weather description: Calculate the average temperature and total precipitation from data stored in arrays
 *
 * @author Filip Kin
 * @version 2019-11-11
 */

import java.util.Scanner;

public class AnnualWeatherV2 {
    public static void main(String[] args) {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);
        String city = "Orlando";
        String state = "FL";

        String[] moArr = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        double[] tempArr = {60.9, 62.6, 67.4, 71.5, 77.1, 81.2, 82.4, 82.5, 81.1, 75.3, 68.8, 63.0};     //initialize with Fahrenheit values
        double[] precArr = {2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3};      //initialize with inch values

        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in

        System.out.print("Choose temperature unit (F or C): ");
        boolean tempSI = in.nextLine().substring(0, 1).equalsIgnoreCase("c");
        System.out.print("Choose precipitation unit (in or cm): ");
        boolean precSI = in.nextLine().substring(0, 1).equalsIgnoreCase("c");


        //Processing - calculate average temperature and total precipitation
        int i;
        double temp = 0, prec = 0;
        for (i = 0; i < tempArr.length; i++) {
            if (tempSI) tempArr[i] = (tempArr[i]-32.0)*(5.0/9.0);
            if (precSI) precArr[i] = precArr[i]*2.54;
            temp += tempArr[i];
            prec += precArr[i];
        }
        temp = temp/i;

        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city + ", " + state);
        System.out.println("Month     Temperature (" + tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        for (i = 0; i < tempArr.length; i++) {
            System.out.printf("%-15s", moArr[i]);
            System.out.printf("%.1f", tempArr[i]);
            System.out.printf("%20.1f%n", precArr[i]);
            //System.out.println(moArr[i]+"\t"+(double) Math.round(tempArr[i]*10)/10+"\t"+(double) Math.round(precArr[i]*10)/10);
        }
        System.out.println("***************************************************");
        System.out.printf("%14s", "Average:");
        System.out.printf("%5.1f", temp);
        System.out.printf("%14s", "Annual:");
        System.out.printf("%6.1f", prec);
        //System.out.println("\t\tAverage: "+(double) Math.round(temp*10)/10+"\t\tAnnual: "+(double) Math.round(prec*10)/10);

    }//end main
}//end class