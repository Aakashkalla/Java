// Eligible to vote or not:
package Questions;
import java.util.*;


public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Age:");
        int age = in.nextInt();
        agef(age);
    }

    static void agef(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
