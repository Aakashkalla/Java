import java.util.*;
public class QuickSort{
    public static void main(String[] args){
        int[] nums = {1,4,5,2,7,9,54,34,2332,1344,53,23445,22344};
        quicksort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void quicksort(int[] arr, int left, int right){
        //Base Condition
        if(left>=right){
            return;
        }

        int pivot_index = partition(arr,left,right);
        quicksort(arr, left, pivot_index-1);
        quicksort(arr, pivot_index+1, right);
    }

    private static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int pI = left-1;

        for(int i = left;i<right;i++){
            if(arr[i]<pivot){
                pI++;
                //swap the element at pI and i
                int temp = arr[pI];
                arr[pI] = arr[i];
                arr[i] = temp;
            }
        }

        //swap pI+1 and right
        int temp  = arr[pI+1];
        arr[pI+1] = arr[right];
        arr[right] = temp;

        return pI+1;
 
    }
}