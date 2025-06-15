// Used to understand pass by value
public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;
        swapf(a,b);
        System.out.println(a+ " " +b);
    }
    static void swapf(int a,int b){
        a=20;
        b=10;
    }
}
