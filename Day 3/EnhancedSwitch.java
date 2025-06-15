import java.util.*;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a fruit(Mango/Apple/Banana/Watermelon):");
        String fruit = input.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruits");
            case "Apple" -> System.out.println("Sweet Red Fruit");
            case "Banana" -> System.out.println("Long Yellow Fruit");
            case "Watermelon" -> System.out.println("Large Sweet Green Fruit");
            default -> System.out.println("Error");
        }
        input.close();
    }
}