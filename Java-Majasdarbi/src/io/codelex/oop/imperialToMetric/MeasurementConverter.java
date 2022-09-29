package io.codelex.oop.imperialToMetric;

public class MeasurementConverter {
    public double converter(ConversionType type, double quantity) {
        switch (type) {
            case METERS_TO_YARDS:
                return quantity * 1.0936133;
            case YARDS_TO_METERS:
                return quantity * 0.9144;
            case CENTIMETERS_TO_ICHES:
                return quantity * 0.3937;
            case INCHES_TO_CENTIMETERS:
                return quantity * 2.54;
            case KILOMETERS_TO_MILES:
                return quantity * 0.62137119;
            case MILES_TO_KILOMETERS:
                return quantity * 1.609344;
            default:
                return quantity;
        }
    }
}
