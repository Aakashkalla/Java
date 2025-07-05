import java.util.*;
public class Question4 {
    public static void main(String[] args){
        int[] nums = {1,2,3,5,2,3,4,5,5,3,2,1};
        System.out.println(duplicate(nums));
    }
    public static boolean duplicate(int[] nums){
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++ ){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
