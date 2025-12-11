package Algorithms;// Find second-biggest number in array



public class SecondMaxArray {
    public static void main(String[] args){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int[] num = {5, 12, 50, 14, 9, 28};

        System.out.print("Array: ");
        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " | ");
            if (num[i] > max1) {
                max2 = max1;
                max1 = num[i];
            } else if (num[i] < max1 && num[i] > max2) {
                max2 = num[i];
            }
        }
        System.out.println();
        System.out.println("Max 1 = " + max1);
        System.out.println("Max 2 = " + max2);
    }
}
