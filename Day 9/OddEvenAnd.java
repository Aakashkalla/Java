
public class OddEvenAnd {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(isOddEven(n));
    }   
    static boolean isOddEven(int n){
        return (n & 1) == 1;
    }  
}
