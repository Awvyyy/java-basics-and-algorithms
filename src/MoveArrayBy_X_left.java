// Move array by x to the left




import java.util.Scanner;
public class MoveArrayBy_X_left {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = {1, 4, 13, 75, 38, 19};
        int[] shifted;
        shifted.length = num.length;
        int x = scanner.nextInt();
        if (x > num.length){
            x = x % num.length;
        }

    }
}






