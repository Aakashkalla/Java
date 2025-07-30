import java.util.*;
public class KLargestElement {
    public static void main(String[] args){
        int[] nums = {1,2,5,3,6,9,7};
        int k=4;
        System.out.println(kLargestEle(nums, k));
    }

    public static int kLargestEle(int[] nums, int k){
        Arrays.sort(nums);
        int i = nums.length-k;
        return nums[i];
    }
}
