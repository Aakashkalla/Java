// Reversing the number and also checking palindrome or not:
package Questions;
import java.util.*;
public class Question22 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = in.nextInt();
        reversef(n);
    }
    static void reversef(int n){
        int copy = n;
        int reverse = 0;
        while(n>0){
            int r = n%10;
            reverse = reverse*10+r;
            n = n/10;
        }
        if(copy==reverse){
            System.out.println("Palindrome number " + reverse);
        }
        else{
            System.out.println("Your reversed number :" + reverse);
        }
    }
}
