package org.example.e32;

import java.util.Objects;
import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your gender: M or F");
        String gender = scanner.next();

        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        if (age > 25) {

            if(Objects.equals(gender, "F")){
                System.out.println("Woman");
            }else{
                System.out.println("Man");

            }

        } else {

            if(Objects.equals(gender, "F")){
                System.out.println("Girl");
            }else{
                System.out.println("Boy");
            }


        }



    }
}
