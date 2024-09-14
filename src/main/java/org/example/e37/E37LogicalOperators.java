package org.example.e37;

import java.util.Scanner;

public class E37LogicalOperators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Are you thirsty? (true/false)");
        boolean isThirsty = scanner.nextBoolean();

        System.out.println("Are you sleepy? (true/false)");
        boolean isSleepy = scanner.nextBoolean();

        if(isThirsty&&!isSleepy){
            System.out.println("Looks like you need to drink water");

        } else if (isThirsty&&isSleepy) {
            System.out.println("Looks like you need to drink coffee");

        } else if (!isThirsty&&isSleepy) {
            System.out.println("Looks like you need to drink tea");

        }else {
            System.out.println("Looks like you need to drink nothing");


        }

    }
}
