import java.util.Scanner;
public class Datatypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int a = input.nextInt();
        System.out.println(a);
        System.out.print("Please enter a letter: ");
        char b = input.next().charAt(0);
        System.out.println(b);
        System.out.print("Pleae enter a float: ");
        float c = input.nextFloat();
        System.out.println(c);
        System.out.print("Pleae enter a large float: ");
        double d = input.nextDouble();
        System.out.println(d);
        System.out.print("Pleae enter a large integer: ");
        double e = input.nextLong();
        System.out.println(e);
        input.close();
    }
}
