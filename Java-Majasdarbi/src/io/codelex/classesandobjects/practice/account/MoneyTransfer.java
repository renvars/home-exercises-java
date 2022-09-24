package io.codelex.classesandobjects.practice.account;

public class MoneyTransfer {
    public static void main(String[] args) {
        Account matt = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);
        transferMoney(matt, myAccount, 100);
        System.out.println(matt);
        System.out.println(myAccount);
    }

    public static void transferMoney(Account from, Account to, double amount) {
        from.withdrawal(amount);
        to.deposit(amount);
    }
}
