package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
        double morningExpense = 25.41;
        double afternoonExpense = 25.42;
        double eveningExpense = 25.42;

        double totalExpense = morningExpense + afternoonExpense + eveningExpense;

        double budget = 100.00;

        if (totalExpense <= budget){
            System.out.println("Your total daily expense is: "+ String.format("%.2f",totalExpense));
            System.out.println("You are within the budget.");
        }



        // Check if within budget


    }
}
