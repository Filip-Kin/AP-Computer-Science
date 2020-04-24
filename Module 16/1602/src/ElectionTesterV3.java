/**
 * Tests the Candidate class
 *
 * @author Filip Kin
 * @version 2020-04-21
 */

public class ElectionTesterV3 {
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
            System.out.printf("%-24s%-26d%d%n", c.getName(), c.getNumVotes(), (int) ((c.getNumVotes() / total) * 100));
        }
    }

    public static void replaceVotes(Candidate[] election, String findName, int replaceVotes) {
        for (int i = 0; i < election.length; i++) {
            if (election[i].getName().equals(findName)) {
                election[i].setNumVotes(replaceVotes);
            }
        }
    }

    public static void replaceCandidate(Candidate[] election, String findName, String replaceName, int replaceVotes) {
        for (int i = 0; i < election.length; i++) {
            if (election[i].getName().equals(findName)) {
                election[i].setName(replaceName);
                election[i].setNumVotes(replaceVotes);
            }
        }
    }

    public static void main(String args[]) {
        Candidate[] election = new Candidate[10];
        election[0] = new Candidate("Lekisha Hilbert", 3224);
        election[1] = new Candidate("Merissa Simental", 6144);
        election[2] = new Candidate("Ashlyn Rieck", 9114);
        election[3] = new Candidate("Eldridge Krieger", 4601);
        election[4] = new Candidate("Janine Coach", 4701);
        election[5] = new Candidate("Herman Reneau", 10251);
        election[6] = new Candidate("Jimmie Cohen", 4422);
        election[7] = new Candidate("Jill Verdugo", 9362);
        election[8] = new Candidate("Alonso Maclennan", 2147);
        election[9] = new Candidate("Lettie Minelli", 7052);
        System.out.println("Original Results:\n");
        printResults(election);
        System.out.println("\nTotal number of votes in election: " + getTotal(election));
        System.out.println("Changing Lekisha Hilbert to Angelia Lakes\n");
        replaceCandidate(election, "Lekisha Hilbert", "Angelia Lakes", election[0].getNumVotes());
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