/// Find largest digit in number


import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = Math.abs(input.nextInt());
        int digit = 0;
        int max = 0;

        while (num > 0) {
            digit = num % 10;
            num = num / 10;

            if (max < digit)
                max = digit;
        }
        System.out.println("Largest number is: " + max);
        input.close();
    }
}
