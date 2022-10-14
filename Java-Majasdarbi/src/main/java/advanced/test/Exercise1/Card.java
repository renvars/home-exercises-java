package advanced.test.Exercise1;

public abstract class Card {
    private final String number;
    private final String fullName;
    private String CCV;
    private int balance;

    public Card(String number, String fullName, String CCV, int balance) {
        this.number = number;
        this.fullName = fullName;
        if (CCV.charAt(0) != '0') {
            System.out.println("Incorrect CCV number,set to '0'");
            this.CCV = "0";
        } else {
            this.CCV = CCV;
        }

        this.balance = balance;
    }

    public void warning(int amount) {
        if (getBalance() - amount < 0) {
            throw new NotEnoughFundsException("Not enough funds!");
        }
    }

    ;

    public void checkCCV() {
        if (getCCV().length() != 3 || getCCV().charAt(0) != '0') {
            throw new CCVException("Fix the CCV!");
        }
    }

    abstract void withdrawMoney(int amount);

    abstract void depositMoney(int amount);

    //GETTERS and Setters

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCCV(String CCV) {
        this.CCV = CCV;
    }

    public String getNumber() {
        return number;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCCV() {
        return CCV;
    }

    public int getBalance() {
        return balance;
    }
}
