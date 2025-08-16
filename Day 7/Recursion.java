
public class Recursion {
    public static void main(String[] args){
        print(11);
    }
    public static void print(int n){
        if(n== 1){
            System.out.println(n);
            return;
        }
        print(n-1);
        System.out.println(n); 

    }
}
