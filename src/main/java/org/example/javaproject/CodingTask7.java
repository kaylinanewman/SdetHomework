package org.example.javaproject;

public class CodingTask7 {
    public static void main(String[] args) {

        int num = 10;
        int firstNum = 0;
        int secondNum = 1;

        System.out.println("The first 10 numbers of the Fibonacci Series are: ");

        for (int i = 1; i <= num; ++i) {
            System.out.println(firstNum + " ");
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }

    }
}
