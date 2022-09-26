package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class Video {
    String title;
    boolean isCheckedOut = false;
    ArrayList<Double> allRatings = new ArrayList<>();
    double averageRating;

    public Video(String title, double averageRating) {
        this.title = title;
        this.allRatings.add(averageRating);
        this.averageRating = averageRating;
    }

    public Video(String title) {
        this.title = title;
    }

    public void checkOutVideo() {
        isCheckedOut = true;
    }

    public void returnVideo() {
        isCheckedOut = false;
    }

    public void receiveARating(double rating) {
        allRatings.add(rating);
        this.averageRating = averageRating(allRatings);
    }

    private static double averageRating(ArrayList<Double> allRatings) {
        double sum = 0;
        for (Double rating : allRatings) {
            sum += rating;
        }
        //calculateAverage
        double average = sum / allRatings.size();
        return Math.round(average * 100.0) / 100.0;

    }
}
