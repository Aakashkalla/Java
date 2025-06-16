import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int[] arr1 = new int[5] ;
        // System.out.println(arr1[0]);

        // String[] arr = new String[0];
        // System.out.println(arr[1]);

        String[] str = new String[4];
        for(int i = 0; i<str.length;i++ ){
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));
    }    
}
