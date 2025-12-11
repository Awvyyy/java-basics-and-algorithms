package Algorithms;// Move array by x to the left



import java.util.Scanner;
public class MoveArrayBy_X_left {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = {1, 4, 13, 75, 38, 19};
        int[] shifted = new int[num.length];
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        if (x > num.length) {
            x = x % num.length;
        }

        System.out.println("numbers will be moved by " + x + " positions.");
        System.out.print("Old Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");

        }
        if (x > num.length) {
            x = x % num.length;
        }

        for (int i = 0; i < num.length; i++) {
            int newIndex = (i - x + num.length) % num.length;
            shifted[newIndex] = num[i];
        }

        System.out.println();
        System.out.print("New array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(shifted[i] + " ");
        }
    }
}










