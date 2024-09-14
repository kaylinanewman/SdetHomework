package org.example.javaproject;

public class CodingTask9 {
    public static void main(String[] args) {

        int[] numbers = {8, 43, 87, 10, 99};

        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }
        System.out.println("The second largest number in this array is " + secondLargest + ".");
    }
}
