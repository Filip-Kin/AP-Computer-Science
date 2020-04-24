import java.util.ArrayList;
import java.util.Arrays;

/**
 * Tests the Music class using a sequential search
 *
 * @author Filip Kin
 * @version 2020-04-23
 */
public class MusicTesterV3 {
    public static void main(String args[]) {
        // My personal playlist, I only listen to *good* music
        ArrayList<Music> music = new ArrayList<Music>(Arrays.asList(
            new Music("The End of All Things", 2013, "Panic! At The Disco"),
            new Music("Good Things Fall Apart", 2019, "ILLENIUM, Jon Bellion"),
            new Music("Exile Vilify", 2011, "The National"),
            new Music("Clocks", 2002, "Coldplay"),
            new Music("Missing You", 1984, "John Waite"),
            new Music("Memories", 2019, "Maroon 5"),
            new Music("New Person, Same Old Mistakes", 2015, "Tame Impala"),
            new Music("Missed Calls", 2011, "Mac Miller"),
            new Music("The Good In Me", 2016, "Jon Bellion"),
            new Music("Californication", 1999, "Red Hot Chili Peppers"),
            new Music("Love Me Less", 2019, "MAX, Quinn XCII")
        ));

        System.out.println("Music library");
        System.out.println("----------------");
        printMusic(music);
        
        /*
        System.out.println("\nSort by - Title");
        printMusic(sortTitle(music, false));
        System.out.println("\nSort by - Artist");
        printMusic(sortArtist(music, false));
        System.out.println("\nSort by - Year");
        printMusic(sortYear(music, true));
        */

        System.out.println("\nSearch - Title - Californication");
        searchTitle(sortTitle(music, false), "Californication");
        System.out.println("\nSearch - Title - Missed Calls");
        searchTitle(sortTitle(music, false), "Missed Calls");
        System.out.println("\nSearch - Year - 2019");
        searchYear(sortYear(music, false), 2019);
        System.out.println("\nSearch - Year - 2015");
        searchYear(sortYear(music, false), 2015);
        System.out.println("\nSearch - Artist - Jon Bellion");
        searchArtist(sortArtist(music, false), "Jon Bellion");
        System.out.println("\nSearch - Artist - Panic! At The Disco");
        searchArtist(sortArtist(music, false), "Panic! At The Disco");
    }

    public static void printMusic(ArrayList<Music> m) {
        for (Music song : m) {
            System.out.println(song);
        }
    }

    public static void searchTitle(ArrayList<Music> m, String toFind) {
        search(m, toFind, 1);
    }

    public static ArrayList<Music> sortTitle(ArrayList<Music> m, boolean reverse) {
        return SortMusic.merge(m, 1, reverse);
    }

    public static void searchArtist(ArrayList<Music> m, String toFind) {
        search(m, toFind, 2);
    }

    public static ArrayList<Music> sortArtist(ArrayList<Music> m, boolean reverse) {
        return SortMusic.merge(m, 2, reverse);
    }

    public static void searchYear(ArrayList<Music> m, int toFind) {
        search(m, toFind, 3);
    }

    public static ArrayList<Music> sortYear(ArrayList<Music> m, boolean reverse) {
        return SortMusic.merge(m, 3, reverse);
    }

    public static void search(ArrayList<Music> m, int toFind, int type) {
        search(m, Integer.toString(toFind), type);
    }

    public static void search(ArrayList<Music> m, String toFind, int type) {
        int high = m.size();
        int low = -1;
        int probe;

        while (high - low > 1) {
            probe = (high + low) / 2;
            if (check(m, probe, toFind, type) > 0) {
                high = probe;
            } else {
                low = probe;
            }
        }

        if (check(m, low, toFind, type) != 0) {
            System.out.println("No results found");
        } else {
            StringBuilder out = new StringBuilder();
            while (check(m, low, toFind, type) == 0) {
                out.append(m.get(low).toString()+"\n");
                low--;
                if (low < 0) break;
            }
            int found = high-low-1;
            System.out.println(found + " Result"+((found!=1)?"s":"")+": \n"+out.toString());
        }

    }

    public static int check(ArrayList<Music> m, int i, String toFind, int type) {
        int toFindInt = (type >= 3)?Integer.parseInt(toFind):-1;

        switch (type) {
            case 1:
                return m.get(i).getTitle().compareTo(toFind);
            case 2:
                return m.get(i).getArtist().compareTo(toFind);
            case 3:
                return m.get(i).getYear() - toFindInt;
        }
        return 0;
    }
}