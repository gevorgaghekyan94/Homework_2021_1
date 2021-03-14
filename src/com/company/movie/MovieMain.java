package com.company.movie;

public class MovieMain {

    public static void main(String[] args) {

        Movie movie1 = new Movie("1111");
        Movie movie2 = new Movie("2222");
        Movie movie3 = new Movie("3333");
        Movie movie4 = new Movie("4444");
        Movie movie5 = new Movie("5555");
        Movie movie6 = new Movie("6666");
        Movie movie7 = new Movie("7777");
        Movie movie8 = new Movie("8888");
        Movie movie9 = new Movie("9999");
        Movie movie10 = new Movie("1010");

        Movie[] movies = new Movie[10];
        movies[0] = movie1;
        movies[1] = movie2;
        movies[2] = movie3;
        movies[3] = movie4;
        movies[4] = movie5;
        movies[5] = movie6;
        movies[6] = movie7;
        movies[7] = movie8;
        movies[8] = movie9;
        movies[9] = movie10;

        MovieService.printMovies(movies);

        MovieService.printBestRating(movies);
    }
}
