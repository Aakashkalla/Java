// Reverse a given array:
import java.util.*;
public class Question2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter number:");
            int n1 = sc.nextInt();
            arr[i] = n1;
        }
        System.out.println("Original array: " + Arrays.toString(arr) );
        int left=0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println( "Reversed Array: "+ Arrays.toString(arr));
    }
    
}