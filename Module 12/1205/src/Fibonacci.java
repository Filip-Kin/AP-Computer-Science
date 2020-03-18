/**
 * @purpose Fibonacci sequence generator client class
 * @author Filip Kin
 * @version 2020-02-19
 */

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input;
        FibonacciGenerator generator = new FibonacciGenerator();
        boolean exit = false;
        while (!exit) {
            System.out.println("Input number for Fibonacci calculation (0-46), or enter to exit");
            try {
                input = Integer.parseInt(in.nextLine());
                if (input>46 || input<0) {
                    System.out.println(input + " is not within range (0-46)");
                } else {
                    System.out.println(generator.findFibonacciValue(input));
                }
            } catch(NumberFormatException err) { exit=true;}
        }
    }
}

