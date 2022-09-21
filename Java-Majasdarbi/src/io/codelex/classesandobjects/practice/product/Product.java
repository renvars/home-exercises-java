package io.codelex.classesandobjects.practice.product;

public class Product {
    String name;
    double price;
    int amount;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmout(int amount) {
        this.amount = amount;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", amount " + this.amount);
    }
}
