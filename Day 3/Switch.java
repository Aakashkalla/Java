import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch (fruit) {
            case "Mango":
                System.out.println("Yellow Sweet Fruit");
                break;
            case "Apple":
                System.out.println("Red Sweet Fruit");
                break;
            case "Banana":
                System.out.println("Yellow Long Sweet Fruit");
                break;
            case "Orange":
                System.out.println("Tangy orange");
                break;
            default:
                System.out.println("ERROR");
        }
        input.close();
    }
}
