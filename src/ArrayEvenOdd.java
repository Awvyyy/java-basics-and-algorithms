// Count array even and odd numbers


public class ArrayEvenOdd {
    public static void main(String[] args) {
        int[] num = {31, 24, 0, 4, 6, 17};

        int even = 0;
        int odd = 0;

        System.out.print("Array: ");
        for (int i = 0; i < num.length; i++)
        {
            System.out.print(num[i] + " | ");
            if (num[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println();
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }
}
