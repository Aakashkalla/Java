import java.util.Scanner;
import java.util.ArrayList;
public class ArrayList1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(6);
        for(int i=0;i<5;i++){
            list.add(input.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
    }
}
 