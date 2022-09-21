package io.codelex.classesandobjects.practice.date;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(2001, 8, 23);
        date.displayDate();
        date.setDay(10);
        date.setMonth(1);
        date.setYear(2005);
        date.displayDate();
    }
}
