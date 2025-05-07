package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your DNI number (0–99999999): ");
        int dniNumber = scanner.nextInt();

        try {
            char letter = DniCalculator.calculateLetter(dniNumber);
            System.out.println("The letter for DNI " + dniNumber + " is: " + letter);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}