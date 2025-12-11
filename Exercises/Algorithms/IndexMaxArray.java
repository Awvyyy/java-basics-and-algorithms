package Algorithms;//Find max value and index of max value



public class IndexMaxArray {
    public static void main(String[] args) {
        int[] num = {31, 24, 36, 4, 6, 17};
        int max = num[0];
        int maxIndex = 0;

        System.out.print("Array: ");
        for(int i = 0; i < num.length; i++)
        {
            System.out.print(num[i] + " | ");
            if (num[i] > max)
            {
                max = num[i];
                maxIndex = i;
            }
        }

        System.out.println();
        System.out.println("Max value: " + max);
        System.out.println("Max index: " + maxIndex);
    }
}
