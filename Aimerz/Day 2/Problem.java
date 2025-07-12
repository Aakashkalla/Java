import java.util.*;
public class Problem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        SumofNums(a);
        CheckEvenOrOdd(a);
        Factorial(a);
        System.out.println(Prime(a));
    }

    public static void SumofNums(int a){
        int sum = (a*(a+1))/2;
        System.out.println(sum);
    }
    public static void CheckEvenOrOdd(int a){
        if(a%2==0){
            System.out.println( true);
        }
        else{
            System.out.println(false);
        }
    }    
    public static void Factorial(int a){
        int factorial = 1;
        for(int i = 1;i<=a;i++ ){
            factorial = factorial *i;
        }
        System.out.println(factorial);
    }
    public static String Prime(int a){
        int factor = 0;
        for(int i =1 ;i*i<=a;i++){
            if(a%i==0){
                factor++;
                if(a/i!=i) factor++;
            }
            if (factor>2) return "Not Prime";
        }        
        return "Prime";
    }
}
