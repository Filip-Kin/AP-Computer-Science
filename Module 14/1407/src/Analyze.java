import java.io.IOException;
import java.util.Scanner;

/**
 * Analyze the characters in a file
 * 
 * @author Filip Kin
 * @version 2020-03-26
 */

class Analyze {
    public static void main(String[] args) {
        System.out.println("This application will analyze the usage of letters in a text file");
        Scanner in = new Scanner(System.in);
        String defaultPath = "./plaintext.txt";
        String defaultAnalysis = "percentage";
        String path;
        boolean percentages = true;

        while (true) {
            System.out.print("Please input a path to the file needing analysis (relative or absolute) ["+defaultPath+"]: ");
            path = in.nextLine();
            if (path.equals("")) path = defaultPath;
            if (!FileInterface.exists(path)) {
                System.out.println("File must exist!");
                continue;
            }

            System.out.print("Would you like the analysis to be in percentage or count ["+defaultAnalysis+"]: ");
            String analysis = in.nextLine();
            if (analysis.equals("")) analysis = defaultAnalysis;
            if (analysis.equalsIgnoreCase("count")) percentages = false;
            break;
        }

        in.close();

        try { 
            // Read file
            FileInterface inputFile = new FileInterface(path, "r");
            FrequencyAnalyzer analysis = new FrequencyAnalyzer(inputFile.readFile());
            inputFile.close();

            // Analyze
            analysis.analyze();
            if (percentages) analysis.toPercents();
            String out = analysis.toString();

            // Output
            System.out.println(out);
            String newPath = path.replace(".txt", "Freq.txt").toString();
            FileInterface outputFile = new FileInterface(newPath, "w");
            outputFile.write(out);
            outputFile.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}