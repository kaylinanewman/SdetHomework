package org.example.e68;

public class E68Arrays {
    public static void main(String[] args) {

        char [] characters = {'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};

        for (int i = 0; i < characters.length; i+=2) {
            System.out.print(characters[i]);
        }
    }
}
