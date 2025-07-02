
// Plus One leetcode: Add last digit of array into the original array and return array 
// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
// Increment the large integer by one and return the resulting array of digits.
package Questions;
import java.util.*;

public class Question15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int e = in.nextInt();
        int[] n = new int[e];
        for(int i = 0; i<e;i++){    
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
            n[i]=0;
        }
        n = new int[n.length+1];
        n[0]= 1;
        return n;
    }
}
