package com.alexseyf;

/*Create an array of 6 integers
and show them in reverse order.*/

public class Main {

    public static void main(String[] args) {
        int[] array = {5, 9, 8, 22, 47, 98};
        int count = 0;

        System.out.println("Vector:");

        while (count < array.length) {
            System.out.print(array[count] + " ");
            count++;
        }

        System.out.println("\nReverse vector:");

        for (int i = (array.length - 1); i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
