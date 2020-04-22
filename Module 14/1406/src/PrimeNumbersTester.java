import java.util.ArrayList;
import java.util.Scanner;

/**
 * Tests PrimeNumbers class
 * 
 * @author Filip Kin
 * @version 2020-03-26
 */

class PrimeNumbersTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lowerLimit, upperLimit;
        final int COMPUTE_LIMIT = 500000; // Maximum size of range, Trying to find more primes than this can freeze the program

        System.out.println("This application will find all prime numbers within a specified range");

        while(true) {
            System.out.print("Please input the lower limit of the range: ");
            try { 
                lowerLimit = Integer.parseInt(in.nextLine());

                if (lowerLimit < 0) {
                    System.out.println("Lower limit must greater than or equal to 0");
                    continue;
                }

                System.out.print("Please input the upper limit of the range: ");
                upperLimit = Integer.parseInt(in.nextLine());

                if (upperLimit < lowerLimit) {
                    System.out.println("Upper limit must be greater than or equal to lower limit");
                } else if ((upperLimit - lowerLimit) > COMPUTE_LIMIT) {
                    System.out.println("Range must be less than "+COMPUTE_LIMIT);
                } else {
                    break; // Break out of while loop if both conditions are met
                }

            } catch(NumberFormatException e) {
                System.out.println("Limits must be positive integers or zero");
                continue;
            }
        }

        in.close();
        if ((upperLimit - lowerLimit) > (.35*COMPUTE_LIMIT)) System.out.println("This is a large range of numbers to test, this will take a few seconds. Please wait.");

        ArrayList<Integer> primes = new PrimeNumbers(lowerLimit, upperLimit).findPrimes();
        System.out.println("All prime numbers between "+lowerLimit+" and "+upperLimit+": ");
        System.out.print(primes.get(0));
        for (int prime : primes.subList(1, primes.size())) {
            System.out.print(", "+prime);
        }
        System.out.println("\nNumber of primes: "+primes.size());
    }
}