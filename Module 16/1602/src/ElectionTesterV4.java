import java.util.ArrayList;
import java.util.List;
/**
 * Tests the Candidate class
 *
 * @author Filip Kin
 * @version 2020-04-21
 */
public class ElectionTesterV4 {
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
            System.out.printf("%-24s%-26d%d%n", c.getName(), c.getNumVotes(), (int) ((c.getNumVotes() / total) * 100));
        }
    }

    public static void replaceVotes(List<Candidate> election, String findName, int replaceVotes) {
        for (int i = 0; i < election.size(); i++) {
            if (election.get(i).getName().equals(findName)) {
                election.get(i).setNumVotes(replaceVotes);
            }
        }
    }

    public static void replaceCandidate(List<Candidate> election, String findName, String replaceName,
            int replaceVotes) {
        for (int i = 0; i < election.size(); i++) {
            if (election.get(i).getName().equals(findName)) {
                election.get(i).setName(replaceName);
                election.get(i).setNumVotes(replaceVotes);
            }
        }
    }

    public static void main(String args[]) {
        List<Candidate> election = new ArrayList<Candidate>();
        election.add(new Candidate("Lekisha Hilbert", 3224));
        election.add(new Candidate("Merissa Simental", 6144));
        election.add(new Candidate("Ashlyn Rieck", 9114));
        election.add(new Candidate("Eldridge Krieger", 4601));
        election.add(new Candidate("Janine Coach", 4701));
        election.add(new Candidate("Herman Reneau", 10251));
        election.add(new Candidate("Jimmie Cohen", 4422));
        election.add(new Candidate("Jill Verdugo", 9362));
        election.add(new Candidate("Alonso Maclennan", 2147));
        election.add(new Candidate("Lettie Minelli", 7052));
        System.out.println("Original Results:\n");
        printResults(election);
        System.out.println("\nTotal number of votes in election: " + getTotal(election));
        System.out.println("Changing Lekisha Hilbert to Angelia Lakes\n");
        replaceCandidate(election, "Lekisha Hilbert", "Angelia Lakes", election.get(0).getNumVotes());
        printResults(election);
        System.out.println("\nTotal number of votes in election: " + getTotal(election));
        System.out.println("Changing Eldridge Krieger votes to 3694:\n");
        replaceVotes(election, "Eldridge Krieger", 3694);
        printResults(election);
        System.out.println("\nTotal number of votes in election: " + getTotal(election));
        System.out.println("Replacing Lettie Minelli with Marylyn Zaragosa\n");
        replaceCandidate(election, "Lettie Minelli", "Marylyn Zaragosa ", 7294);
        printResults(election);
        System.out.println("\nTotal number of votes in election: " + getTotal(election));
    }
}