// Find amount of above average numbers in array



public class AboveAvgArray {
    public static void main(String[] args) {
        int[] num = {31, 24, 0, 4, 6, 17};
        double sum = 0;
        double avg = 0;
        int aboveAvg = 0;

        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++)
            {
            System.out.print(num[i] + ", ");
            sum += num[i];
            }

        avg = sum / num.length;

        for (int i = 0; i < num.length; i++)
            {
            if (num[i] > avg)
                aboveAvg++;

            }

        System.out.println();
        System.out.println("Avg: " + avg);
        System.out.println("Sum: " + sum);
        System.out.println("Numbers above average: " + aboveAvg);
    }
}
