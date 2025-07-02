//Area of triangle, rectangle and square:
package Questions;
import java.util.*;
public class Question10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome this program takes 2 input and prints triangle, rectangle and square area");
        System.out.print("Enter 2 integers:");
        double a = in.nextDouble();
        double b = in.nextDouble();
        areat(a, b);
        areas(a);
        arear(a,b);
    }
    static void areat(double a, double b){
        double area = 0.5*a*b;
        System.out.println("Area of triangle is: " + area );
    }
    static void areas(double a){
        double areas = a*a;
        System.out.println("Area of square is: " + areas);
    }
    static void arear(double a, double b){
        double arear = a*b;
        System.out.println("Area of rectangle is: " + arear);
    }
}
