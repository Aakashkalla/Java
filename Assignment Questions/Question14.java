// return the difference of product and sum of digits
import java.util.*;
public class Question14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = in.nextInt();
        System.out.println(func(n));
    }
    static int func(int n){
        int s=0;
        int p=1;
        
        while(n>0){
            int r = n%10;
            s=s+r;
            p=p*r;
            n=n/10;
        }
        return p-s;
    }
}
