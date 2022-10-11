package io.codelex.polymorphism.practice.exercise3;

public class TestPerson {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Newman", "Koka Iela 2", 12345, "Accountant");
        Student student = new Student("Peter", "Parker", "Aristida maize 60", 7777, 4.8);
        System.out.println("Employee display:");
        employee.display();
        System.out.println("Student display:");
        student.display();
    }
}
