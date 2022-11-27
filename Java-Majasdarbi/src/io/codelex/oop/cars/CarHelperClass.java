package io.codelex.oop.cars;

import java.time.LocalDate;
import java.util.ArrayList;

public class CarHelperClass {
    public static final String[] MANUFACTURERS = {
            "Toyota Motor Corp",
            "Volkswagen AG",
            "Daimler AG",
            "Ford Motor Co",
            "Honda Motor Co. Ltd.",
            "Bayerische Motoren Werke AG",
            "General Motors Co.",
            "Fiat Chrysler Automobiles NV"
    };
    public static final String[] COUNTRY_MANUFACTURER = {
            "Germany",
            "China",
            "USA",
            "France",
            "Italy",
            "Japan",
            "Germany",
            "USA",
    };
    public static final LocalDate[] YEAR_OF_ORIGIN = {
            LocalDate.of(1990, 1, 1),
            LocalDate.of(1984, 1, 1),
            LocalDate.of(2001, 1, 5),
            LocalDate.of(2012, 1, 5),
            LocalDate.of(1968, 1, 5),
            LocalDate.of(1880, 1, 5),
            LocalDate.of(1912, 1, 5),
            LocalDate.of(1955, 1, 5),

    };
    public static final String[] MODELS = {
            "A-Class", "A6 allroad", "Aviator", "BRZ", "Cayenne",
            "Civic", "CLS", "Cybertruck", "E-PACE"
    };

    public static final String[] NAMES = {
            "Ford", "Subaru", "Porsche", "Mercedes-Benz", "Toyota",
            "Volvo", "Chevrolet", "GMC"
    };

}
