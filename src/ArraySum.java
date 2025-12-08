// Create array and find a sum of numbers


public class ArraySum {
    public static void main(String[] args) {
        int[] num = {5,10,20,50,22};
        int sum = 0;

        System.out.print("Array elements: ");

        for (int i = 0; i < num.length; i++)
        {
            sum += num[i];
            System.out.print(num[i] + " ");

        }

        System.out.println(" ");
        System.out.println("Sum = " + sum);

        }
    }
