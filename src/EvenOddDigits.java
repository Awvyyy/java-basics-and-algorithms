// Count all even and odd digits in given number

import java.util.Scanner;

public class EvenOddDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = Math.abs(input.nextInt());
        int even = 0;
        int odd = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0) even++;
            else odd++;

            num /= 10;
        }

        System.out.println("Even digits: " + even);
        System.out.println("Odd digits: " + odd);

        input.close();
    }
}
