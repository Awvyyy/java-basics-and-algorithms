package Algorithms;// find digit amount, digit sum and max num



import java.util.Scanner;

public class DigitsNumMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number = Math.abs(scanner.nextInt());
        int digits = 0;
        int digitSum = 0;
        int maxNumber = 0;

        while(number > 0)
        {
            int digit = number % 10;
            digits++;
            digitSum += digit;
            number = number / 10;

            if (digit > maxNumber)
                maxNumber = digit;
        }

        System.out.println("Amount of digits: " + digits);
        System.out.println("Sum of all digits: " + digitSum);
        System.out.println("Max number: " + maxNumber);
        scanner.close();
    }
}
