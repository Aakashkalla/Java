import java.util.*;
public class question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius:");
        double radius = in.nextDouble();
        System.out.print("Enter height:");
        double height = in.nextDouble();
        System.out.print("Enter base:");
        double base = in.nextDouble();
        System.out.print("Enter length:");
        double length = in.nextDouble();
        volumef(radius, height, base, length);
    }
    static void volumef(double radius, double height,double base,double length){
        System.out.println("Volume of Cone: " + (3.14*radius*radius*height)/3);
        System.out.println("Volume of Prism: " + base*height);
        System.out.println("Volume of Cylinder: " + (3.14*radius*radius*height));
        System.out.println("Volume of Sphere: " + (4*3.14*radius*radius*radius)/3);
        System.out.println("Volume of Pyramid: " + (length*base*height)/3);
    }
}
