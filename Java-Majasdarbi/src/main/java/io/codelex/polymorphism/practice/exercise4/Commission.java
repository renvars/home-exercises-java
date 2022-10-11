package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress,
                      String ePhone, String socSecNumber,
                      double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    public double pay() {
        double startPay = super.pay();
        startPay += totalSales * commissionRate;
        totalSales = 0;
        return startPay;
    }

    public String toString() {
        String res = super.toString();
        res += ",TotalSales:" + totalSales;
        return res;
    }

}
