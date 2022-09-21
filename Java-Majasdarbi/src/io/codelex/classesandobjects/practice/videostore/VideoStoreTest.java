package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    public static Video[] movies = new Video[COUNT_OF_MOVIES];

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to display all videos (as user)");
            System.out.println("Choose 5 to display all available videos (as user)");
            System.out.println("Choose 6 to display all rented videos (as user)");
            System.out.println("Choose 7 to rate a video (as user)");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                case 4:
                    displayAllMovies();
                    break;
                case 5:
                    displayMovies(false);
                    break;
                case 6:
                    displayMovies(true);
                    break;
                case 7:
                    rateAMovie(keyboard);
                    break;
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name: ");
            String movieName = scanner.nextLine();
            Video movie = new Video(movieName);
            movies[i] = movie;
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("All available movies - ");
        displayMovies(false);
        System.out.println("Name of movie you want to rent? :");
        String movieName = scanner.nextLine();
        for (Video movie : movies) {
            if (movieName.equals(movie.title)) {
                movie.checkedOut = true;
                System.out.println("You rented - " + movie.title);
                break;
            }
        }

    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Rented movies - ");
        displayMovies(true);
        System.out.println("Name of movie you want to return? :");
        String movieName = scanner.nextLine();
        for (Video movie : movies) {
            if (movieName.equals(movie.title)) {
                movie.checkedOut = false;
                System.out.println("You returned - " + movie.title);
                break;
            }
        }
    }

    public static void displayMovies(boolean rented) {
        StringBuilder rentableMovies = new StringBuilder();
        for (Video movie : movies) {
            if (rented && movie.checkedOut) {
                rentableMovies.append(movie.title).append(" ");
            } else if (!rented && !movie.checkedOut) {
                rentableMovies.append(movie.title).append(" ");
            }
        }
        System.out.println(rentableMovies);
    }

    public static void displayAllMovies() {
        StringBuilder allMovies = new StringBuilder();
        for (Video movie : movies) {
            allMovies.append(movie);
        }
        System.out.println("All available movies - " + allMovies);
    }

    public static void rateAMovie(Scanner scanner) {
        System.out.println("Rate movies - ");
        displayAllMovies();
        System.out.println("Name of movie you want to rate? :");
        String movieName = scanner.nextLine();
        System.out.println("Rating you want to give? :");
        double rating = scanner.nextDouble();
        for (Video movie : movies) {
            if (movieName.equals(movie.title)) {
                movie.rating = rating;
                System.out.println("You rated - " + movie.title + "with a rating of " + rating);
                break;
            }
        }
    }
}
