import java.util.*;
public class RearrangeArr {
    public static void main(String[] args){
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrarr(nums)));
    }
    public static int[] rearrarr(int[] nums){
        int[] arr = new int[nums.length];
        int left = 0;
        int right = 1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                arr[left] = nums[i];
                left = left + 2;
            }
            else {
                arr[right] = nums[i];
                right = right + 2;
            }
        }
        return arr;
    }
}
