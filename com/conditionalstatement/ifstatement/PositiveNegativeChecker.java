package com.conditionalstatement.ifstatement;

import java.util.Scanner;

    public class PositiveNegativeChecker {
        public static void main(String[] args) {
            // Create a Scanner object to take input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a number
            System.out.print("Enter a number: ");

            // Read the number from the user
            double number = scanner.nextDouble();

            // Close the scanner to avoid resource leak
            scanner.close();

            // Check if the number is positive or negative and print the result
            if (number > 0) {
                System.out.println("The entered number is positive.");
            } else if (number < 0) {
                System.out.println("The entered number is negative.");
            } else {
                System.out.println("The entered number is zero.");
            }
        }
    }

