package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you need a loan? (true/false)");

        boolean needsLoan = scanner.nextBoolean();

        if (needsLoan){
            System.out.println("What is your credit score?");
            int creditScore = scanner.nextInt();
            if (creditScore<600){
                System.out.println("The eligibility is Not eligible");
            } else if (creditScore>=600&&creditScore<=700) {
                System.out.println("The eligibility is Maybe eligible");
            } else if (creditScore>=701&&creditScore<=800) {
                System.out.println("The eligibility is Eligible");
            } else if (creditScore>800) {
                System.out.println("The eligibility is Definitely eligible");
            }
        }else {
            System.out.println("The eligibility is Unknown");
        }





    }
}
