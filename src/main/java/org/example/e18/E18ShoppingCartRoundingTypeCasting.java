package org.example.e18;

public class E18ShoppingCartRoundingTypeCasting {
    public static void main(String[] args) {
        // Declare the double variables and assign values
        double item1 = 19.99;
        double item2 = 29.75;
        double item3 = 4.99;

        double totalCost = item1 + item2 + item3;

        totalCost = 54.73;
        int roundedCost = (int) totalCost;

        System.out.println("The original total cost is $" + totalCost);
        System.out.println("The rounded total cost is $" + roundedCost);


    }
}