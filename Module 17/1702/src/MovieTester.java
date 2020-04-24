import java.util.ArrayList;

/**
 * Sorts an ArrayList of Movie objects
 * 
 * @author Filip Kin
 * @version 2020-04-23
 */

public class MovieTester {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<Movie>();

        // Hopefully all of these are school appropriate, cause I just used a random movie generator and only recognize like half of them
        // Why make my brain do work and think of movie titles when I can make a computer do it for me?
        movies.add(new Movie("Whiplash", 2014, "Bold Films"));
        movies.add(new Movie("Flushed Away", 2006, "DreamWorks"));
        movies.add(new Movie("Avengers: Age of Ultron", 2015, "Marvel Studios"));
        movies.add(new Movie("Red Shoes and the Seven Dwarfs", 2019, "Locus Creative Studios"));
        movies.add(new Movie("The Matrix", 1999, "Warner Bros"));
        movies.add(new Movie("Coco", 2017, "Walt Disney Pictures"));
        movies.add(new Movie("Shooter", 2007, "di Bonaventura Pictures"));
        movies.add(new Movie("Thor: The Dark World", 2013, "Marvel Studios"));
        movies.add(new Movie("Mary", 2019, "Tooley Entertainment"));
        movies.add(new Movie("The Call of the Wild", 2007, "Terra Incognita Productions"));

        System.out.println("Movies, unsorted");
        printMovieList(movies);

        System.out.println("\nMovies sorted by title, ascending");
        printMovieList(sortTitle(movies, 1));
        System.out.println("\nMovies sorted by title, descending");
        printMovieList(sortTitle(movies, 2));

        System.out.println("\nMovies sorted by year, ascending");
        printMovieList(sortYear(movies, 1));
        System.out.println("\nMovies sorted by year, descending");
        printMovieList(sortYear(movies, 2));

        System.out.println("\nMovies sorted by studio, ascending");
        printMovieList(sortStudio(movies, 1));
        System.out.println("\nMovies sorted by studio, descending");
        printMovieList(sortStudio(movies, 2));

    }

    public static void printMovieList(ArrayList<Movie> movies) {
        System.out.printf("%-30s %4s   %-20s%n", "Title", "Year", "Studio");
        for(int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i).toString());
        }
    }

    /**
     * Sort ArrayList of Movie by title
     * 
     * @param movies            ArrayList of Movie objects
     * @param sortDirection     1= ascending, 2= descending
     * @return                  Sorted ArrayList of Movie objects
     */
    public static ArrayList<Movie> sortTitle(ArrayList<Movie> movies, int sortDirection) {
        return sort(movies, sortDirection, 1);
    }

    /**
     * Sort ArrayList of Movie by year
     * 
     * @param movies            ArrayList of Movie objects
     * @param sortDirection     1= ascending, 2= descending
     * @return                  Sorted ArrayList of Movie objects
     */
    public static ArrayList<Movie> sortYear(ArrayList<Movie> movies, int sortDirection) {
        return sort(movies, sortDirection, 2);
    }
    
    /**
     * Sort ArrayList of Movie by studio
     * 
     * @param movies            ArrayList of Movie objects
     * @param sortDirection     1= ascending, 2= descending
     * @return                  Sorted ArrayList of Movie objects
     */
    public static ArrayList<Movie> sortStudio(ArrayList<Movie> movies, int sortDirection) {
        return sort(movies, sortDirection, 3);
    }

    /**
     * Sort ArrayList of Movie objects
     * 
     * @param movies            ArrayList of Movie objects
     * @param sortDirection     1=ascending, 2=descending
     * @param sortType          1=title, 2=year, 3=studio
     * @return                  Sorted ArrayList of Movie objects
     */
    public static ArrayList<Movie> sort(ArrayList<Movie> movies, int sortDirection, int sortType) {
        ArrayList<Movie> newList = new ArrayList<Movie>();
        newList.add(movies.get(movies.size()-1));
        for(int i = movies.size()-2; i >= 0; i--) { // Go through each item from bottom to top
            for(int j = newList.size()-1; j >= 0; j--) { // Compare it with each item from bottom to top
                int comparison = 0;
                switch(sortType) {
                    case 1:
                        comparison = movies.get(i).getTitle().compareTo(newList.get(j).getTitle());
                        break;
                    case 2:
                        comparison = movies.get(i).getYear() - newList.get(j).getYear();
                        break;
                    case 3:
                        comparison = movies.get(i).getStudio().compareTo(newList.get(j).getStudio());
                        break;
                }
                if (sortDirection == 1) comparison = comparison * -1; // Reverse direction
                if (comparison <= 0) { // j is now greater than the correct spot
                    newList.add(j+1, movies.get(i));
                    break;
                } else if (comparison >= 0 && j <= 0) { // Element belongs at the top
                    newList.add(j, movies.get(i));
                    break;
                }
            }
        }

        // After iterating through each item it should be in the correct order
        return newList;
    }
}