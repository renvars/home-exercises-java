package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        if (xLength + zLength + yLength > 300) {
            System.out.println("The package dimensions are too big!");
            return false;
        }
        if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("One or more of the sides are too small (<30)");
            return false;
        }
        if (isExpress && weight > 15.0) {
            System.out.println("Package weight too big for express delivery!");
            return false;
        }
        if (!isExpress && weight > 30.0) {
            System.out.println("Package weight too big for delivery!");
            return false;
        }
        return true;
    }
}
