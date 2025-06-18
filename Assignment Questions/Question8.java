//Input Marks and Output Grade
import java.util.*;

public class Question8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter your marks");
        int mark = in.nextInt();
        markf(mark);

    }

    static void markf(int mark) {
        if (91 <= mark && mark <= 100) {
            System.out.println("AA");
        } else if (81 <= mark && mark <= 90) {
            System.out.println("AB");
        } else if (71 <= mark && mark <= 80) {
            System.out.println("BB");
        } else if (61 <= mark && mark <= 70) {
            System.out.println("BC");
        } else if (51 <= mark && mark <= 60) {
            System.out.println("CD");
        } else if (41 <= mark && mark <= 50) {
            System.out.println("DD");
        } else {
            System.out.println("Fail");
        }
    }
}
