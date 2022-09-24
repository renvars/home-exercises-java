package io.codelex.classesandobjects.practice.movie;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static ArrayList<Movie> getPG(ArrayList<Movie> movies) {
        ArrayList<Movie> pgMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                pgMovies.add(movie);
                movie.printMovie();
            }
        }
        return pgMovies;
    }

    public void printMovie() {
        System.out.println("Title :" + this.title + ",Studio: " + this.studio + ",Rating: " + this.rating);
    }
}
