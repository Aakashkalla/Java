import java.util.*;
public class Question17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int copy = n;
        if(n<=0){
            System.out.println("Enter a valid number");
            return;
        }
        while(copy>0){
            int r = copy%10;
            if(r!=0 && n%r==0){
                count++;
            }
            copy=copy/10;
        }
        System.out.println(count);
    }
}
