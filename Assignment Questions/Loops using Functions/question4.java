// returns sum 

import java.util.*;

public class question4 {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(sumf(n));
    }

    static int sumf(int n) {
        Scanner in = new Scanner(System.in);
        int s = 0;
        while (true) {
            System.out.print("Enter a number:");
            n = in.nextInt();
            s = s + n;
            if (n == 0) {
                break;
            } else {
                continue;
            }
        }
        return s;
    }
}
