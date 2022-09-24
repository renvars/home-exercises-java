package io.codelex.classesandobjects.practice.account;

public class FirstAccount {
    public static void main(String[] args) {
        Account firstAccount = new Account("Renars Account", 100);
        firstAccount.deposit(20);
        System.out.println(firstAccount);
    }
}
