package com.company;

public class DistanceConverter {

    public static int convertMetersToMiles(int meters) {
        return (int) (meters * 0.000621);
    }

    public static int convertMilesToMeters(int miles) {
        return (int) (miles * 1609.344);
    }
}
