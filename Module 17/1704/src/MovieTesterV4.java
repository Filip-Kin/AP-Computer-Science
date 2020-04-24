import java.util.ArrayList;
import java.util.Arrays;

/**
 * Sorts an ArrayList of MovieV4 objects
 * 
 * @author Filip Kin
 * @version 2020-04-23
 */

public class MovieTesterV4 {
    public static void main(String[] args) {
        ArrayList<MovieV4> MovieV4s = new ArrayList<MovieV4>();

        // Hopefully all of these are school appropriate, cause I just used a random MovieV4 generator and only recognize like half of them
        // Why make my brain do work and think of MovieV4 titles when I can make a computer do it for me?
        MovieV4s.add(new MovieV4("Whiplash", 2014, "Bold Films"));
        MovieV4s.add(new MovieV4("Flushed Away", 2006, "DreamWorks"));
        MovieV4s.add(new MovieV4("Avengers: Age of Ultron", 2015, "Marvel Studios"));
        MovieV4s.add(new MovieV4("Red Shoes and the Seven Dwarfs", 2019, "Locus Creative Studios"));
        MovieV4s.add(new MovieV4("The Matrix", 1999, "Warner Bros"));
        MovieV4s.add(new MovieV4("Coco", 2017, "Walt Disney Pictures"));
        MovieV4s.add(new MovieV4("Shooter", 2007, "Di Bonaventura Pictures"));
        MovieV4s.add(new MovieV4("Thor: The Dark World", 2013, "Marvel Studios"));
        MovieV4s.add(new MovieV4("Mary", 2019, "Tooley Entertainment"));
        MovieV4s.add(new MovieV4("The Call of the Wild", 2007, "Terra Incognita Productions"));

        System.out.println("MovieV4s, unsorted");
        printMovieV4List(MovieV4s);

        System.out.println("\nMovieV4s sorted by title, ascending");
        printMovieV4List(sortTitle(MovieV4s, 1));
        System.out.println("\nMovieV4s sorted by title, descending");
        printMovieV4List(sortTitle(MovieV4s, 2));

        System.out.println("\nMovieV4s sorted by year, ascending");
        printMovieV4List(sortYear(MovieV4s, 1));
        System.out.println("\nMovieV4s sorted by year, descending");
        printMovieV4List(sortYear(MovieV4s, 2));

        System.out.println("\nMovieV4s sorted by studio, ascending");
        printMovieV4List(sortStudio(MovieV4s, 1));
        System.out.println("\nMovieV4s sorted by studio, descending");
        printMovieV4List(sortStudio(MovieV4s, 2));

    }

    public static void printMovieV4List(ArrayList<MovieV4> MovieV4s) {
        System.out.printf("%-30s %4s   %-20s%n", "Title", "Year", "Studio");
        for(int i = 0; i < MovieV4s.size(); i++) {
            System.out.println(MovieV4s.get(i).toString());
        }
    }

    /**
     * Sort ArrayList of MovieV4 by title
     * 
     * @param MovieV4s            ArrayList of MovieV4 objects
     * @param sortDirection     1= ascending, 2= descending
     * @return                  Sorted ArrayList of MovieV4 objects
     */
    public static ArrayList<MovieV4> sortTitle(ArrayList<MovieV4> MovieV4s, int sortDirection) {
        return sort(MovieV4s, sortDirection, 1, 0, MovieV4s.size() - 1);
    }

    /**
     * Sort ArrayList of MovieV4 by year
     * 
     * @param MovieV4s            ArrayList of MovieV4 objects
     * @param sortDirection     1= ascending, 2= descending
     * @return                  Sorted ArrayList of MovieV4 objects
     */
    public static ArrayList<MovieV4> sortYear(ArrayList<MovieV4> MovieV4s, int sortDirection) {
        return sort(MovieV4s, sortDirection, 2, 0, MovieV4s.size() - 1);
    }
    
    /**
     * Sort ArrayList of MovieV4 by studio
     * 
     * @param MovieV4s            ArrayList of MovieV4 objects
     * @param sortDirection     1= ascending, 2= descending
     * @return                  Sorted ArrayList of MovieV4 objects
     */
    public static ArrayList<MovieV4> sortStudio(ArrayList<MovieV4> MovieV4s, int sortDirection) {
        return sort(MovieV4s, sortDirection, 3, 0, MovieV4s.size() - 1);
    }

    /**
     * Sort ArrayList of MovieV4 objects
     * 
     * @param movies            ArrayList of MovieV4 objects
     * @param sortDirection     1=ascending, 2=descending
     * @param sortType          1=title, 2=year, 3=studio
     * @return                  Sorted ArrayList of MovieV4 objects
     */
    public static ArrayList<MovieV4> sort(ArrayList<MovieV4> movies, int sortDirection, int sortType, int low, int high) {
        if ((high-low) > 1) {
            // Split
            int mid = (int) Math.floor((high-low)/2.0)+low;
            ArrayList<MovieV4> a = sort(movies, sortDirection, sortType, low, mid);
            ArrayList<MovieV4> b = sort(movies, sortDirection, sortType, mid+1, high);

            // Merge
            for(int i = a.size()-1; i >= 0; i--) {
                for(int j = 0; j < b.size(); j++) {
                    if (compare(a.get(i), b.get(j), sortType, sortDirection) <= 0) { // j is the spot
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
            return new ArrayList<MovieV4>(Arrays.asList(movies.get(low)));
        } else {
            if (compare(movies.get(low), movies.get(high), sortType, sortDirection) > 0) return new ArrayList<MovieV4>(Arrays.asList(movies.get(high), movies.get(low)));
            return new ArrayList<MovieV4>(Arrays.asList(movies.get(low), movies.get(high)));
        }
    }

    public static int compare(MovieV4 a, MovieV4 b, int type, int reverse) {
        int comparison = 0;
        switch(type) {
            case 1:
                comparison = a.getTitle().compareTo(b.getTitle());
                break;
            case 2:
                comparison = a.getYear() - b.getYear();
                break;
            case 3:
                comparison = a.getStudio().compareTo(b.getStudio());
                break;
        }
        return (reverse == 2) ? comparison * -1:comparison; // Reverse direction
    }
}