package com.company.movie;

import java.util.Random;

public class Movie {

    private String title;
    private int rating;

    public Movie() {
    }

    public Movie(String title) {
        Random random = new Random();
        this.title = title;
        this.rating = random.nextInt(10) + 1;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating() {
        Random random = new Random();
        this.rating = random.nextInt(10) + 1;
    }
}
