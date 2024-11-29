package com.example.loops;

import java.util.Scanner;

public class DoWhileRunner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = -1;

        do {
            if (number != -1)
                System.out.println("Cube is: " + (number * number * number));

            System.out.println("Enter a number: ");
            number = input.nextInt();

        } while (number >= 0);
        System.out.println("Thank you! Have fun!");
    }
}
