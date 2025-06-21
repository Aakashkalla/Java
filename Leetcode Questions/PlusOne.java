import java.util.*;

public class PlusOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int e = in.nextInt();
        int[] n = new int[e];
        for (int i = 0; i < e; i++) {
            System.out.println("Enter the elemnts:");
            n[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(fun(n)));
    }

    static int[] fun(int[] n) {
        for (int i = n.length - 1; i >= 0; i--) {
            if (n[i] < 9) {
                n[i] = n[i] + 1;
                return n;
            }
            n[i] = 0;
        }
        n = new int[n.length + 1];
        n[0] = 1;
        return n;
    }
}
