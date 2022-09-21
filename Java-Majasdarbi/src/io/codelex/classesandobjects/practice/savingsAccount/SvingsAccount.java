package io.codelex.classesandobjects.practice.savingsAccount;

public class SvingsAccount {
    double balance;

    public SvingsAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double interestRate(double yearlyRate) {
        double monthlyRate = (yearlyRate / 12) / 100;
        this.balance += this.balance * monthlyRate;
        return this.balance * monthlyRate;
    }

}
