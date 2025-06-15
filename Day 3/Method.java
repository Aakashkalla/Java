import java.util.*;

public class Method {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);

    }

    static int sum() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Please enter num1:");
            int num1 = in.nextInt();
            System.out.print("Please enter num2:");
            int num2 = in.nextInt();
            int sum = num1 + num2;
            return sum;
        }
    }
}
