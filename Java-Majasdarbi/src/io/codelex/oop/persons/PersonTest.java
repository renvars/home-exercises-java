package io.codelex.oop.persons;

import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {
        LocalDate employeeStartDate = LocalDate.of(2012, 9, 29);
        Employee employee = new Employee("Peter", "Parker", "260311", 38, "Manager", employeeStartDate);
        Customer customer = new Customer("Lebron", "James", "101201", 45, "CID1234", 130);
        System.out.println("Employee info : " + employee.getInfo());
        System.out.println("Customer info : " + customer.getInfo());
        customer.setPurchaseCount(10);
        System.out.println("Changed Customer info : " + customer.getInfo());

    }
}
