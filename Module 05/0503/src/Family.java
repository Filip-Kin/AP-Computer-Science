import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Family {
    public static void main(String[] args) throws FileNotFoundException {
        int BB = 0, BG = 0, GG = 0;
        Scanner file = new Scanner(new File("maleFemaleInFamily.txt"));
        String line;
        while (file.hasNext()) {
            line = file.nextLine();
            switch (line) {
                case "BB":
                    BB++;
                    break;
                case "GG":
                    GG++;
                    break;
                case "GB":
                case "BG":
                    BG++;
                    break;
            }
        }

        double total = BB+BG+GG;
        System.out.println("Composition statistics for families with two children\n");
        System.out.println("Total number of families: "+total+"\n\nFamilies with");
        System.out.println("\ttwo boys: "+BB+" represent "+(double) Math.round(BB*10000/total)/100+"%");
        System.out.println("\ttwo girls: "+GG+" represent "+(double) Math.round(GG*10000/total)/100+"%");
        System.out.println("\tone boy one girl: "+BG+" represent "+(double) Math.round(BG*10000/total)/100+"%");
        file.close();
    }
}
