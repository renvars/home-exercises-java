package advanced.test.Exercise1;

public class TestCards {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("987675", "MorganFreeman",
                "001", 200);
        DebitCard debitCard = new DebitCard("97847", "Peter Parker",
                "998", 9700);
        creditCard.withdrawMoney(150);
        debitCard.setCCV("011");
        debitCard.depositMoney(1000);
        creditCard.withdrawMoney(70);
    }
}
