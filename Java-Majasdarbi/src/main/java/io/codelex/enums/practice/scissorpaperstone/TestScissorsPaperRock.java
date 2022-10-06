package io.codelex.enums.practice.scissorpaperstone;

import java.util.Random;
import java.util.Scanner;

public class TestScissorsPaperRock {
    public static GameTracker gameTracker = new GameTracker(0, 0, 0);

    public static void main(String[] args) {
        System.out.println("Let us begin...");
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Scissors,Paper,Rock:");
            System.out.print("\tYour turn (Enter s for scissor, p for paper, p for paper, q to quit):");
            GameNames myPick = getName(in.nextLine());
            GameNames botPick = botPick();
            if (myPick == null || gameTracker.getGamesPlayed() == 5) {
                System.out.println("\tThanks for playing!");
                gameTracker.gameStatistics();
                break;
            }
            playGame(myPick, botPick);
        }
    }

    public static GameNames botPick() {
        Random random = new Random();
        int pick = random.nextInt(0, 3);
        return GameNames.values()[pick];
    }

    public static void playGame(GameNames myPick, GameNames botPick) {
        System.out.println("\tMy turn:" + myPick);
        getWinner(myPick, botPick);


    }

    public static void getWinner(GameNames myPick, GameNames botPick) {
        if (myPick == GameNames.SCISSOR) {
            if (botPick == GameNames.ROCK) {
                System.out.println("\tBOT WON!");
                gameTracker.lostGame();
            } else if (botPick == GameNames.PAPER) {
                System.out.println("\tYOU WON!");
                gameTracker.wonGame();
            } else {
                System.out.println("\tIT'S A TIE!");
                gameTracker.tieGame();
            }
        } else if (myPick == GameNames.ROCK) {
            if (botPick == GameNames.ROCK) {
                System.out.println("\tIT'S A TIE!");
                gameTracker.tieGame();
            } else if (botPick == GameNames.PAPER) {
                System.out.println("\tYOU WON!");
                gameTracker.wonGame();
            } else {
                System.out.println("\tBOT WON!");
                gameTracker.lostGame();
            }
        } else {
            if (botPick == GameNames.PAPER) {
                System.out.println("\tIT'S A TIE!");
                gameTracker.tieGame();
            } else if (botPick == GameNames.ROCK) {
                System.out.println("\tYOU WON!");
                gameTracker.wonGame();
            } else {
                System.out.println("\tBOT WON!");
                gameTracker.lostGame();
            }
        }
    }

    public static GameNames getName(String s) {
        Scanner in = new Scanner(System.in);
        int tries = 0;
        if (s.equals("q")) {
            return null;
        }
        while (tries < 3) {
            if (tries > 0) {
                System.out.print("\tAnother trie (s,p,r,q): ");
                s = in.nextLine();
            }

            GameNames name = GameNames.getName(s);
            if (name != null) {
                return name;
            } else {
                System.out.println("\tInvalid Input!");
                tries++;
            }
        }
        System.out.println("Too many invalid inputs!");
        return null;

    }
}
