package org.example.javaproject;

public class CodingTask1 {
    public static void main(String[] args) {

        int[] temperature = {88, 76, 95, 101, 94, 99, 82};
        int maxTemp = temperature[0];
        int minTemp = temperature[0];

        for (int temp : temperature) {
            if (temp > maxTemp) {
                maxTemp = temp;
            }
            if (temp < minTemp) {
                minTemp = temp;
            }
        }
        System.out.println("Highest Temperature of the week: " + maxTemp);
        System.out.println("Lowest Temperature of the week: " + minTemp);

    }
}
