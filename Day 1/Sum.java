import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int a = input.nextInt();
        System.out.print("Please enter your second number: ");
        int b = input.nextInt();
        System.out.println(a+b);
        input.close();
    }
}
