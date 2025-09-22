import java.util.Arrays;
import java.util.Comparator;

class Movie {
    String name;
    int year;

    Movie(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return year + " - " + name;
    }
}

public class FavoriteMoviesByYear {
    public static void main(String[] args) {
        Movie[] movies = {
            new Movie("Finding You", 2021),
            new Movie("One Day", 2011),
            new Movie("The Fault in Our Stars", 2014),
            new Movie("In My Dreams", 2014),
            new Movie("A Copenhagen Love Story", 2025),
            new Movie("Me Before You", 2014),
            new Movie("The Notebook", 2002),
            new Movie("The Map That Leads to You", 2025),
            new Movie("Before We Go", 2014),
            new Movie("The Longest Week", 2014)
        };

        Arrays.sort(movies, Comparator.comparingInt(m -> m.year));

        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}