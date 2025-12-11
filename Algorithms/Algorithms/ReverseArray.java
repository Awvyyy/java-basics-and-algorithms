package Algorithms;// Reverse array in place



public class ReverseArray {
    public static void main(String[] args) {
        int[] num = {31, 24, 0, 4, 6, 17};

        System.out.print("Before: ");
        for (int n : num) {
            System.out.print(n + " ");
        }

        int left = 0;
        int right = num.length - 1;

        while (left < right) {
            int temp = num[left];
            num[left] = num[right];
            num[right] = temp;

            left++;
            right--;
        }

        System.out.println();
        System.out.print("After:  ");
        for (int n : num) {
            System.out.print(n + " ");
        }
    }
}