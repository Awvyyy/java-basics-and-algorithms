// Number classification
// is number positive, negative or zero


import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers will you enter?");
        int n = input.nextInt();

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter number #" + i + ":");
            int num = input.nextInt();

            if (num > 0) positive++;
            else if (num < 0) negative++;
            else zero++;
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);

        input.close();
    }
}
