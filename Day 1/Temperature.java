import java.util.*;
public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Temperature in Celsius: ");
        double c = input.nextDouble();
        double f = c*1.8 + 32;
        System.out.println("Temperature in Fahrenheit: " + f);
        input.close();
    }
}
