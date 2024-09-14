package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Is it weekend? (true/false)");

        boolean isWeekend = scanner.nextBoolean();
        System.out.println( "Are you available? (true/false)");
        boolean isAvailable = scanner.nextBoolean();
        // Determine the subject based on the input
        if (isWeekend&&isAvailable){
            System.out.println("Today you will be learning Java");
        } else if (!isWeekend&&isAvailable) {
            System.out.println("Today you will be learning manual testing");
        } else if (!isAvailable) {
            System.out.println("Today you will be learning no subject");
        } {

        }



    }
}
