import java.util.*;

public class FindUniqueIntArr {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumzero(6)));
    }

    public static int[] sumzero(int n) {
        int r = 1;
        int[] ans = new int[n];
        if (n % 2 == 0) {
            for (int i = 0; i < n; i += 2) {
                ans[i] = r;
                ans[i + 1] = 0 - r;
                r++;
            }
        } else {
            ans[0] = 0;
            for (int i = 1; i < n; i += 2) {
                ans[i] = r;
                ans[i + 1] = 0 - r;
                r++;
            }
        }
        return ans;
    }
}
