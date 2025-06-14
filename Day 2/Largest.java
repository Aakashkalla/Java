import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter three numbers(DON'T ENTER SAME NUMBERS :):");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if(a>b && a>c){
                System.out.println(a + " is the largest number");
        }
        else if(b>c){
            System.out.println(b + " is the largest number");
        }
        else{
            System.out.println(c + " is the largest number");
        }
        input.close();
    }
}