import java.util.*;

public class MaxUniArrDel {
    public static void main(String[] args){
        int[] nums = {-1,-2,-2,-3,-4};
        System.out.println(maxSum(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static int maxSum(int[] nums){
        int max =0;
        int sum = 0;
        Set<Integer> hs = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                hs.add(nums[i]);
            }
            max= Math.max(nums[i],max);
        }
        if(max<0){
            return max;
        }
        for(int j:hs){
            sum=sum+j;
        }
        return sum;
    }
}
