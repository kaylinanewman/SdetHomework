package org.example.e16;

public class E16DistanceConversionModulus {
    public static void main(String[] args) {

        int totalMeters = 1850;

        int kilometers = 1850/1000;
        int meters = 1850%1000;

        System.out.println(totalMeters + " meters is equal to " + kilometers + " kilometers and " + meters + " meters.");


    }
}
