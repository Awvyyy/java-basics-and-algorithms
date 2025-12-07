// Find factorial of number N


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = input.nextInt();

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Factorial = " + result);

        input.close();
    }
}
