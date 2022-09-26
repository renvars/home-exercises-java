package io.codelex.classesandobjects.practice.videostore;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class VideoStore {
    ArrayList<Video> inventory = new ArrayList<>();

    public void addVideo(String title) {
        Video video = new Video(title);
        inventory.add(video);
    }

    public void addVideo(String title, double rating) {
        Video video = new Video(title, rating);
        inventory.add(video);
    }

    public boolean checkOutVideo(String title) {
        for (Video video : inventory) {
            if (video.title.equals(title) && !video.isCheckedOut) {
                video.checkOutVideo();
                return true;
            }
        }
        return false;
    }

    public void returnVideo(String title) {
        for (Video video : inventory) {
            if (video.title.equals(title)) {
                video.returnVideo();
            }
        }
    }

    public void rateAVideo(String title, double rating) {
        for (Video video : inventory) {
            if (video.title.equals(title)) {
                video.receiveARating(rating);
            }
        }
    }

    public void listInventory() {
        System.out.print("Inventory : [");
        for (Video video : inventory) {
            System.out.print("title='" + video.title + "',isCheckedOut=" + video.isCheckedOut + ",rating=" + video.averageRating + ",\n");
        }
        System.out.print("]\n");
    }
}
