/**
 * Tests the Music class using a sequential search
 *
 * @author Filip Kin
 * @version 2020-04-23
 */
public class MusicTesterV1 {
    public static void main(String args[]) {
        // My personal playlist, I only listen to *good* music
        Music[] music = {
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
        };

        System.out.println("Music library:");
        System.out.println("----------------");
        printMusic(music);
        System.out.println("\nSearch - Title - Californication");
        searchTitle(music, "Californication");
        System.out.println("\nSearch - Title - Missed Calls");
        searchTitle(music, "Missed Calls");
        System.out.println("\nSearch - Year - 2019");
        searchYear(music, 2019);
        System.out.println("\nSearch - Year - 2015");
        searchYear(music, 2015);
        System.out.println("\nSearch - Artist - Jon Bellion");
        searchArtist(music, "Jon Bellion");
        System.out.println("\nSearch - Artist - Panic! At The Disco");
        searchArtist(music, "Panic! At The Disco");
    }

    public static void printMusic(Music[] m) {
        for (Music song : m) {
            System.out.println(song);
        }
    }

    public static void searchTitle(Music[] m, String toFind) {
        search(m, toFind, 1);
    }

    public static void searchArtist(Music[] m, String toFind) {
        search(m, toFind, 2);
    }

    public static void searchYear(Music[] m, int toFind) {
        search(m, toFind, 3);
    }

    public static void search(Music[] m, int toFind, int type) {
        search(m, Integer.toString(toFind), type);
    }

    public static void search(Music[] m, String toFind, int type) {
        int found = 0;
        StringBuilder out = new StringBuilder();

        int toFindInt = (type >= 3)?Integer.parseInt(toFind):-1;

        for (int i = 0; i < m.length; i++) {
            boolean match = false;
            switch (type) {
                case 1:
                    match = (m[i].getTitle().compareTo(toFind) == 0);
                    break;
                case 2:
                    match = (m[i].getArtist().compareTo(toFind) == 0);
                    break;
                case 3:
                    match = (m[i].getYear() == toFindInt);
                    break;
            }
            if (match) {
                found++;
                out.append(m[i]+"\n");
            }
        }
        System.out.println((found > 0)?found + " Results: \n"+out.toString():"No results found");
    }
}