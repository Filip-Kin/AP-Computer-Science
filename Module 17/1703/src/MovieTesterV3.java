import java.util.ArrayList;

/**
 * Sorts an ArrayList of MovieV3 objects
 * 
 * @author Filip Kin
 * @version 2020-04-23
 */

public class MovieTesterV3 {
    public static void main(String[] args) {
        ArrayList<MovieV3> MovieV3s = new ArrayList<MovieV3>();

        // Hopefully all of these are school appropriate, cause I just used a random MovieV3 generator and only recognize like half of them
        // Why make my brain do work and think of MovieV3 titles when I can make a computer do it for me?
        MovieV3s.add(new MovieV3("Whiplash", 2014, "Bold Films"));
        MovieV3s.add(new MovieV3("Flushed Away", 2006, "DreamWorks"));
        MovieV3s.add(new MovieV3("Avengers: Age of Ultron", 2015, "Marvel Studios"));
        MovieV3s.add(new MovieV3("Red Shoes and the Seven Dwarfs", 2019, "Locus Creative Studios"));
        MovieV3s.add(new MovieV3("The Matrix", 1999, "Warner Bros"));
        MovieV3s.add(new MovieV3("Coco", 2017, "Walt Disney Pictures"));
        MovieV3s.add(new MovieV3("Shooter", 2007, "Di Bonaventura Pictures"));
        MovieV3s.add(new MovieV3("Thor: The Dark World", 2013, "Marvel Studios"));
        MovieV3s.add(new MovieV3("Mary", 2019, "Tooley Entertainment"));
        MovieV3s.add(new MovieV3("The Call of the Wild", 2007, "Terra Incognita Productions"));

        System.out.println("MovieV3s, unsorted");
        printMovieV3List(MovieV3s);

        System.out.println("\nMovieV3s sorted by title, ascending");
        printMovieV3List(sortTitle(MovieV3s, 1));
        System.out.println("\nMovieV3s sorted by title, descending");
        printMovieV3List(sortTitle(MovieV3s, 2));

        System.out.println("\nMovieV3s sorted by year, ascending");
        printMovieV3List(sortYear(MovieV3s, 1));
        System.out.println("\nMovieV3s sorted by year, descending");
        printMovieV3List(sortYear(MovieV3s, 2));

        System.out.println("\nMovieV3s sorted by studio, ascending");
        printMovieV3List(sortStudio(MovieV3s, 1));
        System.out.println("\nMovieV3s sorted by studio, descending");
        printMovieV3List(sortStudio(MovieV3s, 2));

    }

    public static void printMovieV3List(ArrayList<MovieV3> MovieV3s) {
        System.out.printf("%-30s %4s   %-20s%n", "Title", "Year", "Studio");
        for(int i = 0; i < MovieV3s.size(); i++) {
            System.out.println(MovieV3s.get(i).toString());
        }
    }

    /**
     * Sort ArrayList of MovieV3 by title
     * 
     * @param MovieV3s            ArrayList of MovieV3 objects
     * @param sortDirection     1= ascending, 2= descending
     * @return                  Sorted ArrayList of MovieV3 objects
     */
    public static ArrayList<MovieV3> sortTitle(ArrayList<MovieV3> MovieV3s, int sortDirection) {
        return sort(MovieV3s, sortDirection, 1);
    }

    /**
     * Sort ArrayList of MovieV3 by year
     * 
     * @param MovieV3s            ArrayList of MovieV3 objects
     * @param sortDirection     1= ascending, 2= descending
     * @return                  Sorted ArrayList of MovieV3 objects
     */
    public static ArrayList<MovieV3> sortYear(ArrayList<MovieV3> MovieV3s, int sortDirection) {
        return sort(MovieV3s, sortDirection, 2);
    }
    
    /**
     * Sort ArrayList of MovieV3 by studio
     * 
     * @param MovieV3s            ArrayList of MovieV3 objects
     * @param sortDirection     1= ascending, 2= descending
     * @return                  Sorted ArrayList of MovieV3 objects
     */
    public static ArrayList<MovieV3> sortStudio(ArrayList<MovieV3> MovieV3s, int sortDirection) {
        return sort(MovieV3s, sortDirection, 3);
    }

    /**
     * Sort ArrayList of MovieV3 objects
     * 
     * @param movies            ArrayList of MovieV3 objects
     * @param sortDirection     1=ascending, 2=descending
     * @param sortType          1=title, 2=year, 3=studio
     * @return                  Sorted ArrayList of MovieV3 objects
     */
    public static ArrayList<MovieV3> sort(ArrayList<MovieV3> moviesOld, int sortDirection, int sortType) {
        ArrayList<MovieV3> movies = new ArrayList<MovieV3>();
        for(int i = 0; i < moviesOld.size(); i++) { movies.add(moviesOld.get(i)); } // Deep copy of array

        ArrayList<MovieV3> newList = new ArrayList<MovieV3>();
        while(movies.size() > 1) { // Go through each item
            int lowest = 0; // Start with the first item in the array

            for(int i = 1; i < movies.size(); i++) { // Compare to each item in the array
                int comparison = 0;
                switch(sortType) {
                    case 1:
                        comparison = movies.get(i).getTitle().compareTo(movies.get(lowest).getTitle());
                        break;
                    case 2:
                        comparison = movies.get(i).getYear() - movies.get(lowest).getYear();
                        break;
                    case 3:
                        comparison = movies.get(i).getStudio().compareTo(movies.get(lowest).getStudio());
                        break;
                }
                if (sortDirection == 2) comparison = comparison * -1; // Reverse direction
                if (comparison <= 0) { // i is smaller than lowest
                    lowest = i;
                }
            }

            newList.add(movies.get(lowest)); // Add lowest to new array
            movies.remove(lowest); // Remove from old array
        }
        newList.add(movies.get(0)); // Add in the last item which should be the lowest

        // After iterating through each item it should be in the correct order
        return newList;
    }
}