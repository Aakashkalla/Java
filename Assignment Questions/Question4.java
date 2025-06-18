// Add Two numbers using method
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter Your First Number:");
        int num1 = in.nextInt();
        System.out.print("Please Enter Your Second Number:");
        int num2 = in.nextInt();
        System.out.println("Sum of Your Two Numbers:" + sumf(num1, num2));
    }

    static int sumf(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
