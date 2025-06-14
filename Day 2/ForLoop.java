import java.util.*;
public class ForLoop {
    public static void main(String[] args) {
    //    Take input from user n and print 1 to n:
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i + " Hello World!");
        }
        input.close();
    }
}
