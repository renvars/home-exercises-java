package io.codelex.classesandobjects.practice.product;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product("Logitech mouse", 70.00, 14);
        Product prod2 = new Product("iPhone 5s", 999.99, 3);
        Product prod3 = new Product("Epson EB-U05", 440.46, 1);
        prod1.printProduct();
        prod2.printProduct();
        prod3.printProduct();
        prod2.setPrice(300.99);
        prod2.setAmout(20);
        System.out.println("-----------");
        prod2.printProduct();
    }
}
