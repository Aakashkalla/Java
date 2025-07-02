//Palindrome
package Questions;
import java.util.*;
public class Question11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your number to check palindrome or not:");
        int n = in.nextInt(); 
        System.out.println(palindrome(n)); 
    }
    static boolean palindrome(int n){
        int copy = n;
        int s = 0;
        while(n>0){
            int r = n%10;
            s = s*10+r;
            n = n/10;

        }
        return s==copy;
    }
}
