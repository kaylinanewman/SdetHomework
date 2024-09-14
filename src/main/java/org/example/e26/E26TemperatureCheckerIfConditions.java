package org.example.e26;

public class E26TemperatureCheckerIfConditions {
    public static void main(String[] args) {

        int temperature = 25;

        if (temperature>=20){
            System.out.println("It's warm outside.");
        }else if (temperature>=10){
            System.out.println("It's cool outside.");
        }else if (temperature<10){
            System.out.println("It's cold outside.");

        }


    }
}
