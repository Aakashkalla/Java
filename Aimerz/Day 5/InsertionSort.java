import java.util.*;
public class InsertionSort {
    public static void main(String[] args){
        int[] nums = {3,2,1,4};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void insertionSort(int[] nums){
        for(int i = 1;i<nums.length;i++){
            int v = nums[i];
            int j = i-1;

            while(j>=0 && nums[j]>v){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = v;
        }
    }    
}
