import java.util.ArrayList;
import java.util.List;

/**
 * Tests the Candidate class
 *
 * @author Tushaar Kamat
 * @version 02/14/2017
 */
public class ElectionTesterV2 {
    public static void printVotes(List<Candidate> election) {
        for (Candidate c : election) {
            System.out.println(c);
        }
    }

    public static int getTotal(List<Candidate> election) {
        int total = 0;
        for (Candidate c : election) {
            total += c.getNumVotes();
        }
        return total;
    }

    public static void printResults(List<Candidate> election) {
        double total = getTotal(election);
        System.out.printf("%-24s%-26s%s%n", "Candidate", "Votes Received", "% of Total Votes");
        for (Candidate c : election) {
            System.out.printf("%-24s%-26d%d%n", c.getName(), c.getNumVotes(), (int)((c.getNumVotes() / total) * 100));
        }
    }

    public static void main(String args[]) {
        List<Candidate> election = new ArrayList<Candidate>();
        election.add(new Candidate("Lekisha Hilbert", 3224));
        election.add(new Candidate("Merissa Simental", 6144));
        election.add(new Candidate("Ashlyn Rieck", 9114));
        election.add(new Candidate("Eldridge Krieger", 4601));
        election.add(new Candidate("Janine Coach", 4701));
        System.out.println("Results per Candidate\n");
        printVotes(election);
        System.out.println();
        printResults(election);
        System.out.println("\nTotal number of votes in election: " + getTotal(election));
    }
}