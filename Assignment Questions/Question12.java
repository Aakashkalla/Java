// Reverse a number
import java.util.*;

public class Question12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A number to be reversed:");
        int a = in.nextInt();
        System.out.println(reversef(a));
    }

    static int reversef(int a) {
        int s = 0;
        while (a>0) {
            int r = a % 10;
            s = s * 10 + r;
            a = a / 10;
        }
        return s;
    }
}
