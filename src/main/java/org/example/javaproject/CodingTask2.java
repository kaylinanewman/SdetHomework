package org.example.javaproject;

public class CodingTask2 {
    public static void main(String[] args) {

        int[] numbers = {4, 18, 42, 10, 87};

        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.println("The sum of all stored elements is: " + sum);

    }
}
