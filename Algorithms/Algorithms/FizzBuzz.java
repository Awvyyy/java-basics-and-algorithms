package Algorithms;// if number is dividible by 3 - print Fizz
// if number is dividible by 5 - print Buzz
// if number is dividible by 3 and 5 - print Algorithms.FizzBuzz

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("Algorithms.FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }

        scanner.close();
    }
}
