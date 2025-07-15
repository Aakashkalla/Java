public class Fibonacci {
    public static void main(String[] args){
        System.out.println(fib(5));
    }
    public static int fib(int n) {
        if(n<=1) return n;
        int previous = fib(n-1);
        int previousprev = fib(n-2);
        return previous + previousprev;
    }
}
