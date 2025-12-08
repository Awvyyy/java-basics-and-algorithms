// Create array and find min and max value



public class ArrayMinMax {
    public static void main(String[] args) {
        int[] num = {5, 9, 1, 4, 3};
        int min = num[0];
        int max = num[0];
        System.out.print("Array: ");

        for(int i = 0; i < num.length; i++)
        {
            if (num[i] > max) max = num[i];
            if (num[i] < min) min = num[i];
            System.out.print(num[i] + " ");

        }
        System.out.println();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}
