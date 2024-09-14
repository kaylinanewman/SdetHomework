package org.example.e117;

public class E117JavaMethods {
    public static void main(String[] args) {
        int a = sumEvenToX(5);
        int b = sumEvenToX(8);
        System.out.println("sumEvenToX(5) ==> " + a);
        System.out.println("sumEvenToX(8) ==> " + b);
    }

    public static int sumEvenToX(int x) {
        int sum = 0;
        for (int i = 1; i < x+1; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}