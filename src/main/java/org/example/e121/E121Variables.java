package org.example.e121;

public class E121Variables {
    // Declare 3 instance variables: integer, double, and char
    int intValue;
    double doubleValue;
    char charValue;

    public static void main(String[] args) {
        // Create 2 instances of the class
        E121Variables a = new E121Variables();
        E121Variables b = new E121Variables();

        a.intValue= 10;
        a.doubleValue=10.23;
        a.charValue='a';
        System.out.println(a.intValue);
        System.out.println(a.doubleValue);
        System.out.println(a.charValue);
        b.intValue= 100;
        b.doubleValue=100.23;
        b.charValue='s';
        System.out.println(b.intValue);
        System.out.println(b.doubleValue);
        System.out.println(b.charValue);
    }
}
