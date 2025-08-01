import java.util.*;
public class LearningString {
    public static void main(String[] args){
        String a = new String("Kalla");
        String b = new String("Kalla");
        System.out.println(a==b);

        String name = "Aakash";
        String name1 = "Aakash";
        System.out.println(name==name1);
        System.out.println(name.equals(name1));

        String ab = "Aakash";
        System.out.println(ab.charAt(0));

        float af = 453.12345f;
        System.out.printf("Formatted number is %2f",af);

        System.out.printf("Pie: %3f",Math.PI);
        System.out.printf("Hey, My name is %s","Aakash");

        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));
        System.out.println("a"+1);
        System.out.println("Aakash" + new ArrayList<>());

        StringBuilder sb  = new StringBuilder();
        sb.append('a');
        sb.append('b');
        sb.append('c');
        System.out.println(sb.toString());
    }
}
