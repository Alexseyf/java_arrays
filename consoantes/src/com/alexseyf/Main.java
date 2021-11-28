package com.alexseyf;

/*Make a program that reads a 6-character vector,
and say how many consonants were read.
Print the consonants.*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] cons = new String[6];
        int amountcons = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letter = scan.next();

            if (  !(letter.equalsIgnoreCase("a") |
                    letter.equalsIgnoreCase("e") |
                    letter.equalsIgnoreCase("i") |
                    letter.equalsIgnoreCase("o") |
                    letter.equalsIgnoreCase("u"))) {
                cons[count] = letter;
                amountcons++;

            }
            count++;

        } while (count < cons.length);


        System.out.println("Consonants:");
        for (String consonant : cons) {
            if (consonant != null) {
                System.out.print(consonant + " ");
            }
        }
    }
}
