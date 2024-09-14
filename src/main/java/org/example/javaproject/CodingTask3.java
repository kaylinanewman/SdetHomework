package org.example.javaproject;

public class CodingTask3 {
    public static void main(String[] args) {

        int[][] numbers = {
                {3, 4, 2},
                {44, 17, 6, 28},
                {14, 17, 16}
        };
        System.out.println("The even numbers in this array are: ");
        for (int [] row:numbers) {
            for(int num:row){
                if (num%2==0){
                    System.out.print(num+ " ");
                }
            }
        }
    }
}

