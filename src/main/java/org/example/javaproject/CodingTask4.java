package org.example.javaproject;

public class CodingTask4 {
    public static void main(String[] args) {

        int[][] numbers = {
                {3, 4, 2},
                {44, 17, 6},
                {14, 17, 16}
        };
        int evenSum = 0;
        int oddSum = 0;

        for (int[] row : numbers) {
            for (int num : row) {
                if (num % 2 == 0) {
                    evenSum = evenSum + num;
                } else {
                    oddSum = oddSum + num;
                }
            }

        }
        System.out.println("The sum of the even numbers is " + evenSum + " and the sum of the odd numbers is " + oddSum + ".");
    }
}
