//Product of two numbers
import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter Your First Number:");
        int num1 = in.nextInt();
        System.out.print("Please Enter Your Second Number:");
        int num2 = in.nextInt();
        System.out.println("Product of Your Two Numbers:" + multf(num1, num2));

    }

    static int multf(int num1, int num2) {
        int mult = num1 * num2;
        return mult;
    }
}
