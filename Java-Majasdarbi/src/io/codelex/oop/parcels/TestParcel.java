package io.codelex.oop.parcels;

public class TestParcel {
    public static void main(String[] args) {
        Parcel validParcel = new Parcel(50, 50, 50, 25, false);
        Parcel invalidSide = new Parcel(20, 50, 50, 25, false);
        Parcel invalidWeightExpress = new Parcel(50, 50, 50, 25, true);
        Parcel invalidWeight = new Parcel(50, 50, 50, 50, false);
        Parcel invalidSideSum = new Parcel(60, 100, 150, 25, false);
        System.out.println(validParcel.validate());
        System.out.println(invalidSide.validate());
        System.out.println(invalidWeightExpress.validate());
        System.out.println(invalidWeight.validate());
        System.out.println(invalidSideSum.validate());


    }
}
