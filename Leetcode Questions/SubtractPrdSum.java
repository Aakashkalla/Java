
//Given an integer number n, return the difference between the product of its digits and the sum of its digits
import java.util.*;

public class SubtractPrdSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int n = in.nextInt();
        System.out.println(diff(n));
    }

    static int diff(int n) {
        int s = 0;
        int p = 1;
        while (n > 0) {
            int r = n % 10;
            s = s + r;
            p = p * r;
            n = n / 10;
        }
        return p - s;
    }
}
