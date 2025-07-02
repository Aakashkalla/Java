package Questions;
import java.util.*;

public class Question19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int n = in.nextInt();
        System.out.println(sumf(n));
    }

    static int sumf(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n;
            n--;
        }
        return sum;
    }
}
