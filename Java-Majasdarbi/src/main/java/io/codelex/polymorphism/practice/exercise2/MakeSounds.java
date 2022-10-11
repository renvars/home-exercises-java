package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MakeSounds {
    public static void main(String[] arg) {
        List<Sound> sounds = getSounds();
        sounds.forEach(Sound::playSound);


    }

    public static ArrayList<Sound> getSounds() {
        ArrayList<Sound> sounds = new ArrayList<>();
        Firework firework1 = new Firework();
        Firework firework2 = new Firework();
        Firework firework3 = new Firework();
        Parrot parrot1 = new Parrot();
        Parrot parrot2 = new Parrot();
        Parrot parrot3 = new Parrot();
        Radio radio1 = new Radio();
        sounds.add(firework1);
        sounds.add(radio1);
        sounds.add(firework2);
        sounds.add(parrot1);
        sounds.add(parrot2);
        sounds.add(firework3);
        sounds.add(parrot3);
        return sounds;
    }
}
