import java.util.*;
public class RotateArray {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(rotate(nums, k)));
    }
    static int[] rotate(int[] nums, int k){
        if (nums.length <= 1 || k == 0) return nums;
        k = k % nums.length;
        int[] nums2 = new int[nums.length];
        int p1 = 0;
        int p2 = nums.length - k;
        for (int i = 0; i < k; i++) {
            nums2[i] = nums[p2];
            p2++;
        }
        for (int j = k; j < nums.length; j++) {
            nums2[j] = nums[p1];
            p1++;
        }
        for(int h = 0;h<nums.length;h++){
            nums[h] = nums2[h];
        }
        return nums2;
    }
}
