// Prime number between 2 numbers:
package Questions;
import java.util.*;

public class Question20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your First Number:");
        int a = in.nextInt();
        System.out.print("Enter Your Second Number:");
        int b = in.nextInt();
        System.out.println(Arrays.toString(arrf(a, b)));
    }

    static int[] arrf(int a, int b) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            if(isPrime(i)){
                al.add(i);
            }
            
        }
        int[] arr = new int[al.size()];
        for (int j = 0; j < al.size(); j++) {
            arr[j] = al.get(j);
        }
        return arr;

    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
    
}
