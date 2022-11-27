package io.codelex.arrays.practice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    private final static String[] WORDS = {

            "captivate", "redeem", "grandmother", "go", "stamp", "raw", "market", "transmission",
            "coincidence", "evaluate", "lazy", "value", "kneel", "shed", "exit", "incongruous",
            "orgy", "sustain", "method", "harsh", "crown", "torture", "immune", "matter",
            "read", "service", "steam", "elegant", "crude", "belief", "residence", "lily"
    };


    public static void main(String[] args) {
        System.out.println("This is the Hangman!");
        playGame();
        while (playAgain()) {
            playGame();
        }
    }

    public static void playGame() {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int index = random.nextInt(WORDS.length);
        char[] word = WORDS[index].toCharArray();
        ArrayList<Character> guessedLetters = new ArrayList<>();
        ArrayList<Character> missedLetters = new ArrayList<>();
        int guessed = 0;
        while (guessed < 8) {
            if (checkIfWinner(word, guessedLetters)) {
                System.out.println("We have a winner!");
                break;
            }
            drawBoard(word, guessedLetters, missedLetters);
            System.out.print("Guess a letter : ");
            char letter = in.nextLine().charAt(0);
            if (checkIfContainsLetter(word, letter)) {
                guessedLetters.add(letter);
            } else {
                missedLetters.add(letter);
                guessed++;
            }

        }
        if (!checkIfWinner(word, guessedLetters)) {
            System.out.println("Used too many moves!");
        }

    }

    public static void drawBoard(char[] word, ArrayList<Character> guessed, ArrayList<Character> missed) {
        StringBuilder board = new StringBuilder();
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < guessed.size(); j++) {
                if (word[i] == guessed.get(j)) {
                    board.append("-").append(guessed.get(j));
                }
            }
            if (board.length() != (i + 1) * 2) {
                board.append("-_");
            }
        }
        board.append("-");
        System.out.println(board);
        System.out.print("Correct letters :");
        for (Character character : guessed) {
            System.out.print(character);
            System.out.print(" ");
        }
        System.out.print("\n");
        System.out.print("Wrong letters :");
        for (Character character : missed) {
            System.out.print(character);
            System.out.print(" ");
        }
        System.out.print("\n");
    }


    private static boolean checkIfContainsLetter(char[] word, char letter) {
        for (Character chr : word) {
            if (chr == letter) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIfWinner(char[] word, ArrayList<Character> letters) {
        int length = 0;
        for (Character chr : word) {
            for (Character letter : letters) {
                if (chr == letter) {
                    length++;
                }
            }
        }
        return length == word.length;
    }

    public static boolean playAgain() {
        Scanner in = new Scanner(System.in);
        System.out.println("Want to playa gain (yes/no):");
        String play = "no";
        if (in.hasNextLine()) {
            play = in.nextLine().toLowerCase();
        }
        if (play.equals("yes")) {
            return true;
        }
        System.out.println("Thanks for playing!");
        return false;
    }


}
