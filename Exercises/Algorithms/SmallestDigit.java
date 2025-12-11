package Algorithms;// Find the smallest digit in a number but skip zeros

import java.util.Scanner;

public class SmallestDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = Math.abs(input.nextInt());
        int min = 9;

        while (num > 0) {
            int digit = num % 10;
            num = num / 10;

            if (digit != 0 && min > digit)
                min = digit;

        }
        System.out.println("Smallest digit except 0 is: " + min);
}
    }
