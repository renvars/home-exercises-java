package advanced.test.Exercise1;


public class DebitCard extends Card {
    public DebitCard(String number, String fullName, String CCV, int balance) {
        super(number, fullName, CCV, balance);
    }


    @Override
    void withdrawMoney(int amount) {
        checkCCV();
        warning(amount);
        int balance = getBalance();
        setBalance(balance - amount);
    }

    @Override
    void depositMoney(int amount) {
        checkCCV();
        int balance = getBalance();
        if (balance + amount > 10_000) {
            System.out.println("Warning:Too much money");
        }
        setBalance(balance + amount);
    }
}