package Algorithms;// Move array by x to the right



import java.util.Scanner;
public class MoveArrayBy_X_right {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = {4, 8, 18, 46, 23, 97};

        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " | ");
        }

        System.out.println();
        System.out.println("Enter x: ");
        int x = scanner.nextInt();
        if (x > num.length)
            x = x % num.length;
        System.out.println("X: " + x);

        int[] shifted = new int[num.length];

        System.out.println();
        System.out.print("Shifted: ");
        for (int i = 0; i < num.length; i++) {
            int newIndex = (i + x) % num.length;
            shifted[newIndex] = num[i];
        }


        for (int i = 0; i < num.length; i++) {
            System.out.print(shifted[i] + " | ");
        }
    }
}






