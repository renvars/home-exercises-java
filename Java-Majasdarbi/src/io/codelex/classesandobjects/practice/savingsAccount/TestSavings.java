package io.codelex.classesandobjects.practice.savingsAccount;

import java.util.Scanner;

public class TestSavings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How much money is in the account?: ");
        double balance = in.nextInt();
        SvingsAccount account = new SvingsAccount(balance);
        System.out.print("Enter the annual interest Rate :");
        double rate = in.nextInt();
        System.out.print("How long has the account been open? :");
        int n = in.nextInt();
        double totalDeposit = 0;
        double totalWithdraw = 0;
        double interestEarned = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter deposit amount :");
            double deposit = in.nextInt();
            account.deposit(deposit);
            totalDeposit += deposit;
            System.out.println("Enter withdraw amount :");
            double withdraw = in.nextInt();
            account.withdraw(withdraw);
            totalWithdraw += withdraw;
            double interest = account.interestRate(rate);
            interestEarned += interest;
        }
        System.out.println("Total deposited: " + totalDeposit);
        System.out.println("Total withdrawn: " + totalWithdraw);
        System.out.println("Interest earned: " + interestEarned);
        System.out.println("Ending balance: " + account.balance);
    }
}
