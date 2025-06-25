import java.util.*;
public class question2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter radius:");
            double radius = in.nextDouble();
            System.out.print("Enter side1:");
            double side1 = in.nextDouble();
            System.out.print("Enter side2:");
            double side2 = in.nextDouble();
            perimeterf(radius, side1, side2);
        }
    }               
    static void perimeterf(double radius, double side1, double side2){
        System.out.println("Circumference of Circle is: " + 2*3.14*radius);
        System.out.println("Perimeter of Equilateral Triangle: " + side1*3);
        System.out.println("Perimeter of Parallelogram: " + 2*(side1+side2));
        System.out.println("Perimeter of Rectangle: " + 2*(side1+side2));
        System.out.println("Perimeter of Square: " + (side1*4));
        System.out.println("Perimeter of Rhombus: " + (side1*4));
    } 
}
