/**
 * Tests the CandidateV2 class
 *
 * @author Filip Kin
 * @version 2020-04-21
 */

public class ElectionTesterV5 {
    public static void printVotes(CandidateV2[] election) {
        for (CandidateV2 c : election) {
            if (c != null) {
                System.out.println(c);
            }
        }
    }

    public static int getTotal(CandidateV2[] election) {
        int total = 0;
        for (CandidateV2 c : election) {
            if (c != null) {
                total += c.getNumVotes();
            }
        }
        return total;
    }

    public static void printResults(CandidateV2[] election) {
        double total = getTotal(election);
        System.out.printf("%-24s%-26s%s%n", "CandidateV2", "Votes Received", "% of Total Votes");
        for (CandidateV2 c : election) {
            if (c != null) {
                System.out.printf("%-24s%-26d%d%n", c.getName(), c.getNumVotes(),
                        (int) ((c.getNumVotes() / total) * 100));
            }
        }
    }

    public static void replaceVotes(CandidateV2[] election, String findName, int replaceVotes) {
        for (int i = 0; i < election.length; i++) {
            if (election[i] != null && election[i].getName().equals(findName)) {
                election[i].setNumVotes(replaceVotes);
            }
        }
    }

    public static void replaceCandidateV2(CandidateV2[] election, String findName, String replaceName, int replaceVotes) {
        for (int i = 0; i < election.length; i++) {
            if (election[i] != null && election[i].getName().equals(findName)) {
                election[i].setName(replaceName);
                election[i].setNumVotes(replaceVotes);
            }
        }
    }

    public static void insertPosition(CandidateV2[] election, int location, String addN, int addV) {
        for (int i = election.length - 1; i > location; i--)
            election[i] = election[i - 1];

        election[location] = new CandidateV2(addN, addV);
    }

    public static void insertCandidate(CandidateV2[] election, String findN, String addN, int addV) {
        int location = -1;
        for (int i = 0; i < election.length; i++) {
            if (election[i] != null && election[i].getName().equals(findN)) {
                location = i;
                break;
            }
        }
        if (location >= 0) {
            for (int i = election.length - 1; i > location; i--) {
                election[i] = election[i - 1];
            }

            election[location] = new CandidateV2(addN, addV);
        }
    }

    public static void main(String args[]) {
        CandidateV2[] election = new CandidateV2[10];
        election[0] = new CandidateV2("Lekisha Hilbert", 3224);
        election[1] = new CandidateV2("Merissa Simental", 6144);
        election[2] = new CandidateV2("Ashlyn Rieck", 9114);
        election[3] = new CandidateV2("Eldridge Krieger", 4601);
        election[4] = new CandidateV2("Janine Coach", 4701);
        election[5] = new CandidateV2("Herman Reneau", 10251);
        election[6] = new CandidateV2("Jimmie Cohen", 4422);
        election[7] = new CandidateV2("Jill Verdugo", 9362);
        election[8] = new CandidateV2("Alonso Maclennan", 2147);
        election[9] = new CandidateV2("Lettie Minelli", 7052);
        System.out.println("Original Results:\n");
        printResults(election);
        System.out.println("\nTotal number of votes in election: " + getTotal(election));
        System.out.println("Changing Lekisha Hilbert to Angelia Lakes\n");
        replaceCandidateV2(election, "Lekisha Hilbert", "Angelia Lakes", election[0].getNumVotes());
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