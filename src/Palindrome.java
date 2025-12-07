// Goal - check if number is palindrome or not



import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = input.nextInt();
        int original = Math.abs(num);
        int reversed = 0;

        int temp = original;
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        if (original == reversed)
            System.out.println(num + " is a palindrome.");
        else
            System.out.println(num + " is not a palindrome.");

        input.close();
    }
}
