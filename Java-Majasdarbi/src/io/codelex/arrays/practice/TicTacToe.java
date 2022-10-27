package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        play();
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = '-';
    }

    public static void displayBoard(char[][] moveArray) {
        System.out.println("0  " + moveArray[0][0] + "|" + moveArray[0][1] + "|" + moveArray[0][2]);
        System.out.println("1  " + moveArray[1][0] + "|" + moveArray[1][1] + "|" + moveArray[1][2]);
        System.out.println("2  " + moveArray[2][0] + "|" + moveArray[2][1] + "|" + moveArray[2][2]);
        System.out.println("   0 1 2");
    }

    private static void play() {
        initBoard();
        displayBoard(board);
        Scanner keyboard = new Scanner(System.in);
        char player = 'X';
        char winner = '-';
        int movesMade = 0;
        while (winner == '-') {
            if (movesMade == 9) {
                break;
            }
            System.out.print("'" + player + "'" + ", choose your location (row,column): ");
            int row = keyboard.nextInt();
            int column = keyboard.nextInt();
            if (!checkInput(row, column)) {
                continue;
            }
            board[row][column] = player;
            displayBoard(board);
            if (checkWinner(board, player)) {
                winner = player;
            } else {
                player = player == 'X' ? 'O' : 'X';
                movesMade++;
            }

        }

        if (winner == '-') {
            System.out.println("It's a TIE!");
        } else {
            System.out.println("WOW! The winner is " + "'" + player + "'! Congrats :)");
        }


    }

    public static boolean checkInput(int row, int column) {
        if (row < 0 || row > 3) {
            return false;
        }
        if (column < 0 || column > 3) {
            return false;
        }
        return true;
    }

    public static boolean checkWinner(char[][] moveArray, char player) {
        return (moveArray[0][0] == player && moveArray[0][1] == player && moveArray[0][2] == player) ||
                (moveArray[1][0] == player && moveArray[1][1] == player && moveArray[1][2] == player) ||
                (moveArray[2][0] == player && moveArray[2][1] == player && moveArray[2][2] == player) ||
                (moveArray[0][0] == player && moveArray[1][1] == player && moveArray[2][2] == player) ||
                (moveArray[0][2] == player && moveArray[1][1] == player && moveArray[2][0] == player);

    }


}