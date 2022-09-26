package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    private static final VideoStore videoStore = new VideoStore();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to rate a video (as user)");
            System.out.println("Choose 5 to list available videos!");
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
                    rateVideo(keyboard);
                    break;
                case 5:
                    videoStore.listInventory();
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.next();
            System.out.println("Enter rating");
            double rating = scanner.nextDouble();
            videoStore.addVideo(movieName, rating);
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        boolean checkedOut = videoStore.checkOutVideo(movieName);
        if (!checkedOut) {
            System.out.println("Sorry this movie has been rented already!");
        } else {
            System.out.println(movieName + " has been rented out successfully!");
        }
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        videoStore.returnVideo(movieName);
        System.out.println(movieName + " has been returned successfully!");

    }

    private static void rateVideo(Scanner scanner) {
        System.out.println("Enter movie name");
        String movieName = scanner.next();
        System.out.println("Enter movie rating");
        double rating = scanner.nextDouble();
        videoStore.rateAVideo(movieName, rating);
        System.out.println(movieName + " has been rated with " + rating);
    }
}
