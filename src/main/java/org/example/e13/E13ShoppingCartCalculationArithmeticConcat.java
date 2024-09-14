package org.example.e13;

public class E13ShoppingCartCalculationArithmeticConcat {
    public static void main(String[] args) {


        float item1 = 30.0f;
        float item2 = 20.0f;
        float item3 = 40.0f;

        float totalCost = item1 + item2 + item3;
        double discountRate = 0.1;
        double discountAmount = totalCost*discountRate;

        double finalPrice = totalCost - discountAmount;

        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Discount Amount: $" + discountAmount);
        System.out.println("Final Price: $" + finalPrice);

    }
}
