package io.codelex.oop.persons;

public abstract class Person {
    private final String firstName;
    private final String lastName;
    private final String id;
    private int age;

    public Person(String firstName, String lastName, String id, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    abstract String getInfo();


    //GETTER
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

}
