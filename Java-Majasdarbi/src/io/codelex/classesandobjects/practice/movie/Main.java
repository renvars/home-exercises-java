package io.codelex.classesandobjects.practice.movie;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures");
        movie3.printMovie();
        movie2.printMovie();
        movie1.printMovie();
    }
}
