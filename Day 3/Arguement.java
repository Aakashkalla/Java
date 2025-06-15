import java.util.*;
public class Arguement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String name=input.nextLine();
        System.out.println(greetf(name));
        System.out.print("Please Enter 2 numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(sumf(a,b));  

    }
    static int sumf(int a , int b){
        int sum=a+b;
        return sum;
    }

    static String greetf(String name){
        String greet ="Hello";
        return greet + " " + name + ", Welcome!";
    }
}
