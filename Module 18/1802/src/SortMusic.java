import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class full of different sorting methods
 * 
 * @author Filip Kin
 * @version 2020-04-23
 */

public class SortMusic {
    /**
     * Comparison method shared by all sorting types
     * 
     * @param musicsOld
     * @param reverse
     * @param type
     * @return
     */
    public static int compare(Music a, Music b, int type, boolean reverse) {
        int comparison = 0;
        switch(type) {
            case 1:
                comparison = a.getTitle().compareTo(b.getTitle());
                break;
            case 2:
                comparison = a.getArtist().compareTo(b.getArtist());
                break;
            case 3:
                comparison = a.getYear() - b.getYear();
                break;
        }
        if (reverse) comparison = comparison * -1; // Reverse direction
        return comparison;
    }

    /**
     * Insert sort of ArrayList
     * 
     * @param musics     ArrayList of Music objects
     * @param type      1=barcode, 2=musicName, 3=quantity, 4=price
     * @param reverse   Should the results be descending instead of ascending
     * @return          Sorted ArrayList of Music objects
     */
    public static ArrayList<Music> insert(ArrayList<Music> musics, int type, boolean reverse) {
        ArrayList<Music> newList = new ArrayList<Music>();
        newList.add(musics.get(0));
        for(int i = 1; i < musics.size(); i++) { // Go through each music
            for(int j = 0; j < newList.size(); j++) { // Compare it with each music
                if (compare(musics.get(i), newList.get(j), type, reverse) <= 0) { // j is now greater than the correct spot
                    newList.add(j, musics.get(i));
                    break;
                } else if (compare(musics.get(i), newList.get(j), type, reverse) >= 0 && j >= (newList.size()-1)) { // Element belongs at the top
                    newList.add(musics.get(i));
                    break;
                }
            }
        }

        // After iterating through each music it should be in the correct order
        return newList;
    }

    /**
     * Selection sort of ArrayList
     * 
     * @param musics     ArrayList of Music objects
     * @param type      1=barcode, 2=musicName, 3=quantity, 4=price
     * @param reverse   Should the results be descending instead of ascending
     * @return          Sorted ArrayList of Music objects
     */
    public static ArrayList<Music> selection(ArrayList<Music> musicsOld, int type, boolean reverse) {
        ArrayList<Music> musics = new ArrayList<Music>();
        for(int i = 0; i < musicsOld.size(); i++) { musics.add(musicsOld.get(i)); } // Deep copy of array

        ArrayList<Music> newList = new ArrayList<Music>();
        while(musics.size() > 1) { // Go through each music
            int lowest = 0; // Start with the first music in the array

            for(int i = 1; i < musics.size(); i++) { // Compare to each music in the array
                if (compare(musics.get(i), musics.get(lowest), type, reverse) <= 0) { // i is smaller than lowest
                    lowest = i;
                }
            }

            newList.add(musics.get(lowest)); // Add lowest to new array
            musics.remove(lowest); // Remove from old array
        }
        newList.add(musics.get(0)); // Add in the last music which should be the lowest

        // After iterating through each music it should be in the correct order
        return newList;
    }

    /**
     * Merge sort of ArrayList, Assumes 0 and max index as low and high
     * 
     * @param musics     ArrayList of Music objects
     * @param type      1=barcode, 2=musicName, 3=quantity, 4=price
     * @param reverse   Should the results be descending instead of ascending
     * @return          Sorted ArrayList of Music objects
     */
    public static ArrayList<Music> merge(ArrayList<Music> musics, int type, boolean reverse) {
        return merge(musics, type, reverse, 0, musics.size()-1);
    }

    /**
     * Merge sort of ArrayList
     * 
     * @param musics     ArrayList of Music objects
     * @param type      1=barcode, 2=musicName, 3=quantity, 4=price
     * @param reverse   Should the results be descending instead of ascending
     * @param low       low index for sorting
     * @param high      max index for sorting
     * @return          Sorted ArrayList of Music objects
     */
    public static ArrayList<Music> merge(ArrayList<Music> musics, int type, boolean reverse, int low, int high) {
        if ((high-low) > 1) {
            // Split
            int mid = (int) Math.floor((high-low)/2.0)+low;
            ArrayList<Music> a = merge(musics, type, reverse, low, mid);
            ArrayList<Music> b = merge(musics, type, reverse, mid+1, high);

            // Merge
            for(int i = a.size()-1; i >= 0; i--) {
                for(int j = 0; j < b.size(); j++) {
                    if (compare(a.get(i), b.get(j), type, reverse) <= 0) { // j is the spot
                        b.add(j, a.get(i));
                        break;
                    } else if (j >= b.size()-1) { // i goes to the top;
                        b.add(a.get(i));
                        break;
                    }
                }
            }

            return b;
        } else if ((high-low) < 1) {
            return new ArrayList<Music>(Arrays.asList(musics.get(low)));
        } else {
            if (compare(musics.get(low), musics.get(high), type, reverse) > 0) return new ArrayList<Music>(Arrays.asList(musics.get(high), musics.get(low)));
            return new ArrayList<Music>(Arrays.asList(musics.get(low), musics.get(high)));
        }
    }
}