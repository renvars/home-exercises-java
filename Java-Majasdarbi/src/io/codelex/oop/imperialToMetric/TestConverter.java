package io.codelex.oop.imperialToMetric;

public class TestConverter {
    private static final int CONSTANT_MEASURE = 10;

    public static void main(String[] args) {
        MeasurementConverter mc = new MeasurementConverter();
        System.out.printf("'10' Meters to yards -> %.2f\n", mc.converter(ConversionType.METERS_TO_YARDS, CONSTANT_MEASURE));
        System.out.printf("'10' Yards to meters -> %.2f\n", mc.converter(ConversionType.YARDS_TO_METERS, CONSTANT_MEASURE));
        System.out.printf("'10' Centimeters to inches -> %.2f\n", mc.converter(ConversionType.CENTIMETERS_TO_ICHES, CONSTANT_MEASURE));
        System.out.printf("'10' Inches to centimeters -> %.2f\n", mc.converter(ConversionType.INCHES_TO_CENTIMETERS, CONSTANT_MEASURE));
        System.out.printf("'10' Kilometers to miles -> %.2f\n", mc.converter(ConversionType.KILOMETERS_TO_MILES, CONSTANT_MEASURE));
        System.out.printf("'10' Miles to kilometers -> %.2f", mc.converter(ConversionType.MILES_TO_KILOMETERS, CONSTANT_MEASURE));

    }
}
