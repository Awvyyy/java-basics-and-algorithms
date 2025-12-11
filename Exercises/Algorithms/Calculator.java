package Algorithms;// +-*/ calculator


import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number #1: ");
        double num1 = Math.abs(scanner.nextDouble());
        System.out.println("Enter an operation: ");
        char operator = scanner.next().charAt(0);
        System.out.println("Enter number #2: ");
        double num2 = Math.abs(scanner.nextDouble());

        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;

            default:
                System.out.println("Unknown operation");
        }
                scanner.close();
    }
}
