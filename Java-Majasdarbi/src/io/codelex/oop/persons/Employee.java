package io.codelex.oop.persons;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Employee extends Person {
    String position;
    LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        LocalDate dateNow = LocalDate.now();
        int years = dateNow.getYear() - startedWorking.getYear();
        if (DAYS.between(startedWorking.plusYears(years), dateNow) < 0) {
            years -= 1;
        }

        return years;
    }

    @Override
    String getInfo() {
        return position
                + " " + getFirstName()
                + " " + getLastName() + " "
                + "(" + getWorkExperience() + " years)";
    }
}
