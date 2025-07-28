import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args){
        int[] nums = {1,3,0};
        System.out.println(missNum(nums));
    }
    public static int missNum(int[] nums){
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0;i<nums.length;i++){
            if(i!=nums[i]){
                count = i;
                return count;
            }
            else{
                count = nums.length;
            }
        }
        
        return count; 
    }
}
