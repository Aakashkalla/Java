//Returns largest number:
import java.util.*;

public class question5 {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(largestf(n) + " is the largest number");
    }

    static int largestf(int n) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        while (true) {
            System.out.print("Enter a number:");
            n = in.nextInt();
            if (n == 0) {
                break;
            }
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
}
