package org.example.e71;

public class E71Arrays {
    public static void main(String[] args) {

        int[] values = {45, 78, 12, 67, 55, 89, 23, 77, 88};

        for (int i = 1; i < values.length; i += 3) {
            System.out.print(values[i] + " ");
        }
    }
}
