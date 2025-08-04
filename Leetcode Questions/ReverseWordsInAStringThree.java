import java.util.*;
public class ReverseWordsInAStringThree {
    public static void main(String[] args){
        String s = "Mr Ding";
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
    }
    public static String reverseWords(String s){
        String[] arr = s.split(" ");
        for(int i = 0;i<arr.length;i++){
            char[] array = arr[i].toCharArray();
            int p1 = 0;
            int p2 = array.length-1;
            while(p1<p2){
                char temp = array[p1];
                array[p1] = array[p2];
                array[p2] = temp;
                p1++;
                p2--;
            }
            arr[i] = new String(array);
        }
        return String.join(" ",arr);
    }
}
