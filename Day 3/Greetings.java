import java.util.*;
public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your name?");
        String name = input.nextLine();
        String greetings = greet();
        System.out.println(greetings + " " + name);
    }
    static String greet(){
        String greet ="Hey";
        return greet;
    }
}
