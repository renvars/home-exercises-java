package io.codelex.oop.cars;

import java.time.LocalDate;
import java.util.Objects;

public class Manufacturer {
    private final String name;
    private final LocalDate yearOfEstablishment;
    private final String country;

    public Manufacturer(String name, LocalDate yearOfEstablishment, String country) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.country = country;
    }


    //HASHCODE AND EQUALS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return Objects.equals(name, that.name) && Objects.equals(yearOfEstablishment, that.yearOfEstablishment) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearOfEstablishment, country);
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public LocalDate getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public String getCountry() {
        return country;
    }

    public String toString() {
        return "Manufacturer{name=\"" + name + "\"yearOfEstablishment=\""
                + yearOfEstablishment + "\"country=\"" + country + "\"}";
    }
}
