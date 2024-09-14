package org.example.javaproject;

public class CodingTask8 {
    public static void main(String[] args) {

        int[] num = {13, 4, 21, 6};

        int max = num[0];
        int min = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("The maximum number in this array is: " + max);
        System.out.println("The minimum number in this array is: " + min);
    }
}
