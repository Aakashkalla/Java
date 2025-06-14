import java.util.*;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your alphabet (No special characters) :");
        char ch = input.next().trim().charAt(0);
        if(ch >='a' && ch<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
        input.close();
    }
}
