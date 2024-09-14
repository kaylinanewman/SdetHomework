package org.example.javaproject;

public class CodingTask10 {
    public static void main(String[] args) {

        String [] names = {"Kaylin", "Katie", "John", "Alex", "Katie", "Andrew"};

        System.out.println("Duplicate elements in this array are:");

        for ( int i = 0; i < names.length; i++){

            for (int j = i + 1; j < names.length; j++){

                if (names[i].equals(names[j])){
                    System.out.println(names[j]);
                }

            }

        }

    }
}
