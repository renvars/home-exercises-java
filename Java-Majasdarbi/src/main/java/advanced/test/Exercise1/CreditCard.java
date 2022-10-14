package advanced.test.Exercise1;

public class CreditCard extends Card {
    public CreditCard(String number, String fullName, String CCV, int balance) {
        super(number, fullName, CCV, balance);
    }


    @Override
    void withdrawMoney(int amount) {
        checkCCV();
        warning(amount);
        int balance = getBalance();
        if (balance - amount < 100) {
            System.out.println("Warning: Low funds");
        }
        setBalance(balance - amount);
    }

    @Override
    void depositMoney(int amount) {
        checkCCV();
        int balance = getBalance();
        setBalance(balance + amount);
    }
}
