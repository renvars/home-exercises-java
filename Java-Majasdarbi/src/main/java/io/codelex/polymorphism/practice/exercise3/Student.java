package io.codelex.polymorphism.practice.exercise3;

public class Student extends Person {
    private double gpa;

    public Student(String firstName, String lastName, String address, int id, double gpa) {
        super(firstName, lastName, address, id);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void display() {
        String res = "Employee{" +
                "gpa=" + gpa + "," +
                "firstName=" + getFirstName() + "," +
                "lastName=" + getLastName() + "," +
                "address=" + getAddress() + "," +
                "id=" + getId() + "}";
        System.out.println(res);
    }
}
