package org.example.e28;

public class E28SimpleCalculatorElseIf {
    public static void main(String[] args) {
        // Declare a variable for operator and assign a value
        char operator = '*';

        int num1 = 5;
        int num2 = 10;
        int sum= num1+num2;
        int sub= num1-num2;
        int mult=num1*num2;
        int div= num1/num2;


        if (operator == '+'){
            System.out.println("The sum is: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("The difference is: " + (num1 - num2));
        } else if (operator =='*') {
            System.out.println("The product is: " + (num1 * num2));
        } else if (operator == '/') {
            System.out.println("The quotient is: " + (num1 / num2));
        }else{
            System.out.println("Invalid operator");
        }


        // Perform the corresponding arithmetic operation

    }
}
