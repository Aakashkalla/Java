import java.util.*;

public class question6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        long n  = in.nextLong();
        System.out.println(factorialf(n)); 
    }
    static long factorialf(long n){
        long fact = 1;
        while(n>0){
            
            fact = fact * n;
            n--;
        }
        return fact;
    }
}
