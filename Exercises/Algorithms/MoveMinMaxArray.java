package Algorithms;//



public class MoveMinMaxArray {
    public static void main(String[] args) {
        int num[] = {4, 19, 21, 58, 65, 77, 89, 93};
        int min = num[0];
        int max = num[0];
        int minIndex = 0;
        int maxIndex = 0;

        System.out.print("Old array: ");
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
                minIndex = i;
            }
            if (num[i] > max) {
                max = num[i];
                maxIndex = i;
            }
        }
        System.out.println();

        int temp = num[minIndex];
        num[minIndex] = num[maxIndex];
        num[maxIndex] = temp;

        System.out.print("New array: ");
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
}
