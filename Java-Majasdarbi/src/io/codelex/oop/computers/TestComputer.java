package io.codelex.oop.computers;

public class TestComputer {
    public static void main(String[] args) {
        Computer computer1 = new Computer("16bit", "TheNewOne", "GTX1060", "Nokia", "20");
        Computer computer2 = new Computer("16bit", "TheOldOne", "GTX1060", "Nokia", "20");
        System.out.println(computer2.equals(computer1));
        computer2.setRam("TheNewOne");
        System.out.println(computer2.equals(computer1));

        System.out.println("==============LAPTOP_TEST=============");
        Laptop laptop1 = new Laptop("16bit", "TheNewOne", "GTX1060", "Nokia", "20", 100);
        Laptop laptop2 = new Laptop("16bit", "TheNewOne", "GTX1060", "Samsung", "20", 100);
        System.out.println("Company is different:");
        System.out.println(laptop1.equals(laptop2));
        laptop2.setCompanyLaptop("Nokia");
        System.out.println("Everything is the same:");
        System.out.println(laptop1.equals(laptop2));
        laptop2.setBatteryUsageTime(20);
        System.out.println("Battery life is different:");
        System.out.println(laptop1.equals(laptop2));
        laptop2.setBatteryUsageTime(100);
        System.out.println("Everything is the same:");
        System.out.println(laptop1.equals(laptop2));
        System.out.println(laptop1.toString());
    }
}
