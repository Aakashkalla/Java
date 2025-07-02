//Prime Number or not:
package Questions;
import java.util.*;
public class Question7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter A Number:");
        int prime = in.nextInt();
        System.out.println(primef(prime));
    }
    static String primef(int prime){
        if(prime==1){
            return "1 is not a Prime Number";
        }
        int counter = 0;
        for(int i = 1; i<=prime; i++){
            if(prime%i==0){
            counter++;
            }
        }
        if(counter==2){
            return prime + " is a Prime Number";
        }
        
            return prime + " is not a Prime Number";
        
    }
}
