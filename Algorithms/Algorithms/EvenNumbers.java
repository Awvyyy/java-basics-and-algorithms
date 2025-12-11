package Algorithms;// Print only even numbers from 1 to N


import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

        input.close();
    }
}
