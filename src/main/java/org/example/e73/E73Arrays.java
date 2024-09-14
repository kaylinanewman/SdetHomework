package org.example.e73;

import java.util.Scanner;

public class E73Arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] elements = new int [5];

        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextInt();
        }
        for (int i = elements.length -1 ; i>= 0; i--) {
            System.out.println(elements[i]);
        }
        scanner.close();
    }
}
