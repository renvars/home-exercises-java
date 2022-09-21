package io.codelex.classesandobjects.practice.videostore;

public class Video {
    String title;
    boolean checkedOut;
    double averageRating;
    double rating;

    public Video(String title, double averageRating) {
        this.title = title;
        this.averageRating = averageRating;
    }

    public Video(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void checkOut(boolean checkedOut) {
        this.checkedOut = true;
    }

    public void returnVideo(boolean checkedOut) {
        this.checkedOut = false;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public void rateVideo(double rating) {
        this.rating = rating;
    }
}
