// Area of Shapes:
import java.util.*;
public class question1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter radius:");
            double radius = in.nextDouble();
            System.out.print("Enter base:");
            double height = in.nextDouble();
            System.out.print("Enter height:");
            double base = in.nextDouble();
            areaf(radius, height, base);
        }
    }
    static void areaf(double radius , double height , double base){
        System.out.println("Area of circle is: " + 3.14*radius*radius);
        System.out.println("Area of Triangle is: " + (height*base)/2);
        System.out.println("Area of Rectangle is: " + height*base);
        System.out.println("Area of Isosceles Triangle is: " + (height*base)/2);
        System.out.println("Area of Parallelogram is: " + height*base);
        System.out.println("Area of Rhombus is: " + (height*base)/2);
        System.out.println("Area of Equilateral Triangle is: " + (1.732*base*base)/4);
    }
}
