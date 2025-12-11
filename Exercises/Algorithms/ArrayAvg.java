package Algorithms;// Create array and find avg num value



public class ArrayAvg {
    public static void main(String[] args) {
        int[] num = {31, -24, 0, -64, -6, 17};
        double sum = 0;
        double avg;

        System.out.print("Array: ");
        for(int i = 0; i < num.length; i++)
        {
            System.out.print(num[i] + " ");
            sum += num[i];
        }
        avg = sum / num.length;

        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

    }
}
