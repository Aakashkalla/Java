// Fizzbuzz
package Questions;
import java.util.*;
public class Question21 {
    public static void main(String[] args){
        ArrayList<String> arraylist = new ArrayList<>();
        for(int i = 1 ; i<=100;i++){
            if(i%3==0 && i%5==0){
                arraylist.add("FizzBuzz " + i);
            }
            else if(i%3==0){
                arraylist.add("Fizz " + i);
            }
            else if(i%5==0){
                arraylist.add("Buzz " + i);
            }
            else{
                arraylist.add( "" + i);
            }
        }
        String[] arr = new String[arraylist.size()];
        for(int j = 0 ; j<arr.length;j++){
            arr[j] = arraylist.get(j);
        }
        System.out.println(Arrays.toString(arr));
    }
}
