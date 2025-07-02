//A given Number is Even or Odd.
package Questions;
import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer:");
        int num = in.nextInt();
        numf(num);

    }

    static void numf(int num) {
        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
