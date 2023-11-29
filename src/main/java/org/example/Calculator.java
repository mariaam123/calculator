package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");

        while (true) {
            System.out.println("Select operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            int choice = 0;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume invalid input
                continue;
            }

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }

            System.out.println("Enter first number:");
            double num1 = 0;
            if (scanner.hasNextDouble()) {
                num1 = scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume invalid input
                continue;
            }

            System.out.println("Enter second number:");
            double num2 = 0;
            if (scanner.hasNextDouble()) {
                num2 = scanner.nextDouble();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // consume invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Result: " + divide(num1, num2));
                    } else {
                        System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        scanner.close();
    }

    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    private static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    private static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
