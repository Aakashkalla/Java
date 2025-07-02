// Factorial Number
package Questions;
import java.util.*;
public class Question9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A Number:");
        int n = in.nextInt();
        facf(n);
        
    }
    static void facf(int n){
        int result = 1;
        for(int i = 1;i<=n;i++){
            result = result*i;
           System.out.println(result);
        }
        
    }
}