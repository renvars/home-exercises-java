package io.codelex.arithmetic.practice;

public class CozaLozaWoza {
    public static void main(String[] args) {
        String result = "";
        for (int i = 1; i <= 110; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                result += "CozaLozaWoza ";
            } else if (i % 3 == 0 && i % 5 == 0) {
                result += "CozaLoza ";
            } else if (i % 3 == 0 && i % 7 == 0) {
                result += "CozaWoza ";
            } else if (i % 5 == 0 && i % 7 == 0) {
                result += "LozaWoza ";
            } else if (i % 3 == 0) {
                result += "Coza ";
            } else if (i % 5 == 0) {
                result += "Loza ";
            } else if (i % 7 == 0) {
                result += "Woza ";
            } else {
                result += i + " ";
            }
            if (i % 11 == 0) {
                result += "\n";
            }
        }
        
        System.out.println(result);
    }
}
