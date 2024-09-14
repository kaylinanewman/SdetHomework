package org.example.e116;

import org.w3c.dom.ls.LSOutput;

public class E116JavaMethods {

    public static void main(String[] args) {
        // Call the bothEven method with various arguments to test the method
        boolean result=bothEven(5,7);
        System.out.println(result);
    }

    public static boolean bothEven(int a, int b) {
        // Inside the method, check if both numbers are even
        if(a%2==0 && b%2==0){

            return true;
        }else{
            return false;
        }
    }

}


