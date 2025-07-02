package Arrays;

public class Arrques1 {
    public static void main(String[] args){
        int [] nums = {1,2,3,4};
        System.out.println(sumf(nums));
    }
    static int sumf(int[] nums){
        int sum = 0;
        for(int i = 0 ; i<nums.length; i++){
            sum = sum + nums[i];
        }
        return sum;
    }
}
