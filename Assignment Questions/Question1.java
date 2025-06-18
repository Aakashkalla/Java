// Java program to find the Largest and Smallest of three Integers using method
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your first integer:");
        int num1 = in.nextInt();
        System.out.print("Please enter your first integer:");
        int num2 = in.nextInt();
        System.out.print("Please enter your first integer:");
        int num3 = in.nextInt();

        System.out.println("Maximum Number:" + maxf(num1, num2, num3));
        System.out.println("Minimum Number:" + minf(num1, num2, num3));

    }

    static int maxf(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max && num2 > num3) {
            max = num2;
        } else if (num3 > max) {
            max = num3;
        }
        return max;
    }

    static int minf(int num1, int num2, int num3) {
        int min = num1;
        if (num2 < min && num2 < num3) {
            min = num2;
        } else if (num3 < min) {
            min = num3;
        }
        return min;
    }
}