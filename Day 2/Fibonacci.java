import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int n = input.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        // int count = 2;
        // while (count <= n) {
        //     int temp = b;
        //     b = b + a;
        //     a = temp;
        //     count++;
        // }
        // System.out.println(b);
        input.close();
    }
}
