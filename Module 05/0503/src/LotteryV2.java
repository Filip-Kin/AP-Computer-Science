/**
 * The Lottery program generates a 3-digit random lottery number ranging
 * from 000 to 999 (inclusive). The user takes a guess and the program
 * provides feedback if the front pair, back pair, all three, or none
 * of the digits match.
 *
 * @author Ada Lovelace
 * @version 7/1/2019
 */

import java.util.Scanner;

public class LotteryV2 {
    public static void main(String[] args) {
        int outer = 7;
        for (outer = 7; outer > 0; outer −= 2) {
            for(int inner = 0; inner < outer; inner++)
            {
                System.out.print("∗");
            }
            System.out.println();
        }
    } //end main
}//end class Lottery