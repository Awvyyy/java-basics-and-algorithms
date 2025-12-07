// Find biggest, smallest and average value


import java.util.Scanner;

public class MaxMinAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers will you enter?");
        int n = input.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter number #" + i + ":");
            int num = input.nextInt();

            if (num > max) max = num;
            if (num < min) min = num;

            sum += num;
        }

        double average = (double) sum / n;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);

        input.close();
    }
}
