// Pythagorean Triplet:
package Questions;
import java.util.*;

public class Question18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        triplet(n);
    }

    static void triplet(int n) {
        int a = n % 10;
        n = n / 10;
        int b = n % 10;
        n = n / 10;
        int c = n % 10;
        int h , d , e = 0;
        if(a>b && a>c){
             h = a;
             e = b;
             d = c;
        }
        else if(b>c){
             h = b;
             e = a;
             d = c;
        }
        else{
             h = c;
             e = a;
             d = b;
        }
        System.out.println(h +" "+ e +" "+d);

        if(h*h == e*e + d*d){
            System.out.println("Triplet");
        }
        else{
            System.out.println("Not a triplet");
        }
        
    }
}
