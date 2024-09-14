package org.example.e43;

import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your electricity usage in kWh");

        int usage = scanner.nextInt();
        double bill;
        if (usage <0){
            System.out.println("Invalid usage entered");
            return;

        }
        switch (usage/100){
            case 0:
                bill = usage*0.12;
                System.out.println("Your electricity bill is $ " +bill);
                break;
            case 1:
                bill = usage*0.15;
                System.out.println("Your electricity bill is $ " +bill);
                break;
            case 2:
                bill = usage*0.20;
                System.out.println("Your electricity bill is $ " +bill);
                break;
            case 3:
                bill = usage*0.25;
                System.out.println("Your electricity bill is $ " +bill);



        }



    }
}
