import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        // reverStringf(s);
        // System.out.println(Arrays.toString(s));
        reverse(s, 0, s.length-1);
        System.out.println(Arrays.toString(s));
    }

    public static void reverStringf(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left = left + 1;
            right = right - 1;
        }
    }

    public static void reverse(char[] s, int i, int j) {
        if(i>=j) return;
        char temp = s[i];
        s[i] = s[j];
        s[j]= temp;
        reverse(s, i + 1, j - 1);
        
    }
}
