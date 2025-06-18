//Print the Circumference and Area of Circle:
import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radius:");
        double radius = in.nextInt();
        circlef(radius);
    }

    static void circlef(double radius) {
        double area = 3.14 * radius * radius;
        double circumference = 2 * 3.14 * radius;
        System.out.println("Area of Circle:" + area);
        System.out.println("Circumference of Circle:" + circumference);

    }
}
