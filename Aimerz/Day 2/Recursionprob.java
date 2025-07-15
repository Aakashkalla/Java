// import java.util.*;
public class Recursionprob {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        boolean result=palindromef(arr, 0, arr.length-1);
        System.out.println(result);
        System.out.println(moves('s', 'd', 'a', 1));
        System.out.println(moves('s', 'd', 'a', 2));
        System.out.println(moves('s', 'd', 'a', 3));
        System.out.println(moves('s', 'd', 'a', 4));
        System.out.println(moves('s', 'd', 'a', 5));
        System.out.println(moves('s', 'd', 'a', 6));

    }

    public static boolean palindromef(int[] arr, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (arr[left] == arr[right]) {
            return palindromef(arr, left+1, right-1);
        }
        return false;
    }

    public static boolean ispalindrome(int[] arr, int left, int right){
        if(left>=right){
            return true;
        }
        return arr[left]==arr[right] && ispalindrome(arr, left+1, right-1);
    }

    public static int moves(char S, char D, char A, int n){
        if(n==1){
            return 1;
        }
        return moves(S,A,D,n-1) + 1 + moves(A,D,S,n-1);
    }
}
