package org.example.e14;

public class E14PizzaPartyModulus {
    public static void main(String[] args) {
        // Declare the int variables and assign values
        int totalSlices = 13;
        int friends = 4;

        int slicePerPerson = 13/4;

        int leftOverSlices = totalSlices%friends;

        System.out.println("Each person gets " + slicePerPerson + " slices.");
        System.out.println("There are " + leftOverSlices + " slices left over.");


    }
}
