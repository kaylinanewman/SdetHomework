package org.example.e122;

public class E122Variables {
    // Declare 3 instance variables: name of the countryName, capital, and populationSize
    String countryName;
    String capital;
    int populationSize;
    // Create a method to display values of instance variables
    public void display(){
        System.out.println("The capital of "+ countryName + " is "+ capital +" and population is " + populationSize);
    }

    public static void main(String[] args) {
        // Create 2 instances of the class
        E122Variables a = new E122Variables();
        E122Variables b = new E122Variables();

        // Assign values to variables for the first instance
        a.countryName="USA";
        a.capital="Washington DC";
        a.populationSize= 330000000;
        a.display();
        b.countryName="Kazakhstan";
        b.capital="Astana";
        b.populationSize= 18500000;
        // Execute the method to display values for the first instance


        b.display();
        // Assign values to variables for the second instance
        // Execute the method to display values for the second instance
    }
}
