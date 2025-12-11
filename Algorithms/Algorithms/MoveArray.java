package Algorithms;// Move array by 1 to the right



 class MoveArray {
     public static void main(String[] args) {
         int[] num = {2, 0, 67, 34, 19, 8};
         int last = num[num.length - 1];

         System.out.print("Before: ");
         for (int i = 0; i < num.length; i++) {
             System.out.print(num[i] + " | ");
         }


         for (int i = num.length - 1; i > 0; i--) {
             num[i] = num[i - 1];
         }
         num[0] = last;

         System.out.println();
         System.out.print("After: ");
         for (int i = 0; i < num.length; i++) {
             System.out.print(num[i] + " | ");
         }
     }
 }