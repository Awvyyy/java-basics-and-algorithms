package Algorithms;// reverse number ><= original number



import java.util.Scanner;

public class ReversedOriginal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = scanner.nextInt();
        int original = num;
        int reversed = 0;

        while(num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        if (original > reversed)
            System.out.println(reversed + " is smaller than " + original);
        else if (original < reversed)
            System.out.println(reversed + " is bigger than " + original);
        else if (original == reversed)
            System.out.println(reversed + " and " + original + " are equal.");

        scanner.close();
    }
}

