/**
 * - Purpose: simulate bird watching and record the raw data
 * - author: Filip Kin
 * - version 2019-11-08
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AnimalPopulation {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to the Bird Watching Simulator 2000\nPlease enter your number of trials (>=1000): ");
        String tS = in.nextLine();
        int tt = Integer.parseInt(tS);
        while (tt<1000) {
            System.out.print(tt+" < 1000, please enter at least 1000 trials: ");
            tS = in.nextLine();
            tt = Integer.parseInt(tS);
        }

        // birds[0-4] are normal birds[5] is the one that stops the trial
        String[] birds = {"Warbler", "Robin", "Woodpecker", "Goldfinch", "Red-Winged Blackbirds", "Cardinal"};

        System.out.println("Simluating "+tS+" trials of bird watching\n" +
                "Possible spottings are: "+Arrays.toString(birds)+"\n");

        if (tt > 500000) System.out.println("This may take a bit");

        File dF = new File("data.txt");
        PrintWriter d = new PrintWriter(dF);
        Random rand = new Random();

        for (int t = 0; t < tt; t++) {
            boolean c = false;
            int aC = 0;
            while (!c) {
                aC++;
                int bN = rand.nextInt(birds.length);
                //System.out.println(birds[bN]);
                if (bN >= birds.length-1) {
                    //System.out.println("\n\tFOUND THE ONE!!!\n\n");
                    c = true;
                }
            }
            d.println(aC);
        }
        d.close();

        Scanner o = new Scanner(dF);
        double total = 0;
        int trials = 0;
        while (o.hasNext()) {
            total += Integer.parseInt(o.nextLine());
            trials++;
        }

        if (trials != tt) System.out.println("Error: Recorded trials doesn't match planned trials");
        double avgTrial = total/trials;

        System.out.println("Trials ended after spotting a "+birds[birds.length-1]+"\n" +
                "Average numbers of birds observed before spotting a "+birds[birds.length-1]+" was: "+avgTrial);
    }
}
