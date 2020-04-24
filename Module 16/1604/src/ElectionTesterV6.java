import java.util.ArrayList;
import java.util.List;
/**
 * Tests the CandidateV2 class
 *
 * @author Filip Kin
 * @version 2020-04-21
 */
public class ElectionTesterV6 {
    public static void printVotes(List<CandidateV2> election) {
        for (CandidateV2 c : election) {
            System.out.println(c);
        }
    }

    public static int getTotal(List<CandidateV2> election) {
        int total = 0;
        for (CandidateV2 c : election) {
            total += c.getNumVotes();
        }
        return total;
    }

    public static void printResults(List<CandidateV2> election) {
        double total = getTotal(election);
        System.out.printf("%-24s%-26s%s%n", "CandidateV2", "Votes Received", "% of Total Votes");
        for (CandidateV2 c : election) {
            System.out.printf("%-24s%-26d%d%n", c.getName(), c.getNumVotes(), (int) ((c.getNumVotes() / total) * 100));
        }
    }

    public static void replaceVotes(List<CandidateV2> election, String findName, int replaceVotes) {
        for (int i = 0; i < election.size(); i++) {
            if (election.get(i).getName().equals(findName)) {
                election.get(i).setNumVotes(replaceVotes);
            }
        }
    }

    public static void replaceCandidateV2(List<CandidateV2> election, String findName, String replaceName,
            int replaceVotes) {
        for (int i = 0; i < election.size(); i++) {
            if (election.get(i).getName().equals(findName)) {
                election.get(i).setName(replaceName);
                election.get(i).setNumVotes(replaceVotes);
            }
        }
    }

    public static void insertPosition(List<CandidateV2> election, int location, String addN, int addV) {
        election.add(location, new CandidateV2(addN, addV));
    }

    public static void insertCandidate(List<CandidateV2> election, String find, String addN, int addV) {
        int location = 0;
        for (int i = 0; i < election.size(); i++) {
            if (election.get(i).getName().equals(find)) {
                location = i;
            }
        }
        election.add(location, new CandidateV2(addN, addV));
    }

    public static void main(String args[]) {
        List<CandidateV2> election = new ArrayList<CandidateV2>();
        election.add(new CandidateV2("Lekisha Hilbert", 3224));
        election.add(new CandidateV2("Merissa Simental", 6144));
        election.add(new CandidateV2("Ashlyn Rieck", 9114));
        election.add(new CandidateV2("Eldridge Krieger", 4601));
        election.add(new CandidateV2("Janine Coach", 4701));
        election.add(new CandidateV2("Herman Reneau", 10251));
        election.add(new CandidateV2("Jimmie Cohen", 4422));
        election.add(new CandidateV2("Jill Verdugo", 9362));
        election.add(new CandidateV2("Alonso Maclennan", 2147));
        election.add(new CandidateV2("Lettie Minelli", 7052));
        System.out.println("Original Results:\n");
        printResults(election);
        System.out.println("\nTotal number of votes in election: " + getTotal(election));
        System.out.println("Changing Lekisha Hilbert to Angelia Lakes\n");
        replaceCandidateV2(election, "Lekisha Hilbert", "Angelia Lakes", election.get(0).getNumVotes());
        printResults(election);
        System.out.println("\nTotal number of votes in election: " + getTotal(election));
        System.out.println("Changing Eldridge Krieger votes to 3694:\n");
        replaceVotes(election, "Eldridge Krieger", 3694);
        printResults(election);
        System.out.println("\nTotal number of votes in election: " + getTotal(election));
        System.out.println("Replacing Lettie Minelli with Marylyn Zaragosa\n");
        replaceCandidateV2(election, "Lettie Minelli", "Marylyn Zaragosa ", 7294);
        printResults(election);
        System.out.println("\nTotal number of votes in election: " + getTotal(election));
        System.out.println("Added Oliwier Keller, 3433 votes:\n");
        insertPosition(election, 5, "Oliwier Keller", 3433);
        printResults(election);
        System.out.println("\nTotal number of votes in election: " + getTotal(election));
        System.out.println("Added Ivor Mccarthy after Jimmie Cohen, 8257 votes\n");
        insertCandidate(election, "Jimmie Cohen", "Ivor Mccarthy", 8257);
        printResults(election);
        System.out.println("\nTotal number of votes in election: " + getTotal(election));
    }
}