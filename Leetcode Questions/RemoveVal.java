import java.util.*;
public class RemoveVal {
    public static void main(String[] args){
        int[] nums = {3,2,2,3};
        int val = 3;
        removeVal(nums,val);
        System.out.println(Arrays.toString(nums));
    }
    public static int removeVal(int[] nums,int val){
        int p1 = 0;
        int p2 = 0;
        while(p1<nums.length){
            if(nums[p1]!=val){
                nums[p2] = nums[p1];
                p2++;
            }
            p1++;
        }
        return p2;
    } 
}
