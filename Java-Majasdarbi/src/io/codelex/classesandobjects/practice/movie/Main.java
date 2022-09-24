package io.codelex.classesandobjects.practice.movie;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures");
        movie3.printMovie();
        movie2.printMovie();
        movie1.printMovie();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        System.out.println("PG MOVIES ONLY");
        Movie.getPG(movies);


    }
}
