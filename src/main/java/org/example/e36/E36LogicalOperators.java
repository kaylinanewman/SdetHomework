package org.example.e36;

import java.util.Scanner;

public class E36LogicalOperators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your monthly rent expense");

        double rentExpense = scanner.nextDouble();

        System.out.println("Please enter your monthly food expense");

        double foodExpense = scanner.nextDouble();

        System.out.println("Please enter your monthly transportation expense");

        double transportationExpense = scanner.nextDouble();

        System.out.println("Please enter your monthly entertainment expense");

        double entertainmentExpense = scanner.nextDouble();

        if(rentExpense>foodExpense&& transportationExpense>entertainmentExpense){
            System.out.println("You are prioritizing essentials well.");

        } else if (rentExpense>foodExpense || transportationExpense>entertainmentExpense) {
            System.out.println("You are on the right track, but could improve.");
        } else if (rentExpense<foodExpense && transportationExpense<entertainmentExpense) {
            System.out.println("You need to rethink your spending priorities.");

        } else {


        }


    }
}
