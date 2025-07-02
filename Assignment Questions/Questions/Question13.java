// Sum of digits
package Questions;
import java.util.*;
public class Question13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int a = in.nextInt();
        System.out.println(sumNum(a));
    }
    static int sumNum(int a){
        if(a<0){
            System.out.println("Enter a valid number");
        }
        int s = 0;
        while(a>0){
            int r = a%10;
            s = s+r;
            a=a/10;
        }
        return s;
    }
}
