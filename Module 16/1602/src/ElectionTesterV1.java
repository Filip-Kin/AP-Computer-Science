/**
 * Tests the Candidate class
 *
 * @author Filip Kin
 * @version 2020-04-21
 */

public class ElectionTesterV1 {
    public static void printVotes(Candidate[] election) {
        for (Candidate c : election) {
            System.out.println(c);
        }
    }

    public static int getTotal(Candidate[] election) {
        int total = 0;
        for (Candidate c : election) {
            total += c.getNumVotes();
        }
        return total;
    }

    public static void printResults(Candidate[] election) {
        double total = getTotal(election);
        System.out.printf("%-24s%-26s%s%n", "Candidate", "Votes Received", "% of Total Votes");
        for (Candidate c : election) {
            System.out.printf("%-24s%-26d%d%n", c.getName(), c.getNumVotes(), (int)((c.getNumVotes() / total) * 100));
        }
    }

    public static void main(String args[]) {
        Candidate[] election = new Candidate[5];
        election[0] = new Candidate("Lekisha Hilbert", 3224);
        election[1] = new Candidate("Merissa Simental", 6144);
        election[2] = new Candidate("Ashlyn Rieck", 9114);
        election[3] = new Candidate("Eldridge Krieger", 4601);
        election[4] = new Candidate("Janine Coach", 4701);
        System.out.println("Results per Candidate\n");
        printVotes(election);
        System.out.println();
        printResults(election);
        System.out.println("\nTotal number of votes in election: " + getTotal(election));
    }
}
© 2020 GitHub, Inc.