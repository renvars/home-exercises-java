package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Write a string : ");
        String input = in.next().toLowerCase();
        boolean isValid = false;
        String result = "";
        if(!onlyLetters(input)){
            System.out.print("Lets try that again! Write a string : ");
            input = in.next().toLowerCase();
            if(!onlyLetters(input)){
                System.out.print("This is your last try! Write a string : ");
                input = in.next().toLowerCase();
                if(!onlyLetters(input)){
                    System.out.print("That's it, you're done! Bye");
                }else{
                    isValid = true;
                }
            }else{
                isValid = true;
            }
        }else{
            isValid = true;
        }
        if(isValid){
            for(int i = 0; i < input.length(); i++){
                switch (input.charAt(i)){
                    case 'a' : case 'b' : case 'c' :
                        result += "2";
                        break;
                    case 'd' : case 'e' : case 'f' :
                        result += "3";
                        break;
                    case 'g' : case 'h' : case 'i' :
                        result += "4";
                        break;
                    case 'j' : case 'k' : case 'l' :
                        result += "5";
                        break;
                    case 'm' : case 'n' : case 'o' :
                        result += "6";
                        break;
                    case 'p' : case 'q' : case 'r' : case 's':
                        result += "7";
                        break;
                    case 't' : case 'u' : case 'v' :
                        result += "8";
                        break;
                    default:
                        result += "9";


                }
            }
        }


        System.out.println("This is the result : " + result);

    }
    public static boolean onlyLetters(String str){
        if(str == null){
            return false;
        }
        int stringLength = str.length();
        for(int i = 0; i < stringLength; i++){
            if(!Character.isLetter(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
