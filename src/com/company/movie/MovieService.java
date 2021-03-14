package com.company.movie;

public class MovieService {

    public static void printBestRating(Movie[] movies) {
        int movieRating = 10;
        boolean check = true;
        while (check) {
            while (movieRating >= 0) {

                for (int i = 0; i < movies.length; i++) {
                    if (movies[i].getRating() == movieRating) {
                        System.out.println(movies[i].getTitle());
                        check = false;
                    }
                }
                movieRating--;
                break;
            }
        }
    }

    public static void printMovies(Movie[] movies) {
        System.out.print("movies: { ");
        for (int i = 0; i < movies.length; i++) {
            System.out.print("{ movie title: " + movies[i].getTitle() + " , movie rating: " + movies[i].getRating() + " }, ");
        }
        System.out.print("}");
        System.out.println();
    }
}
