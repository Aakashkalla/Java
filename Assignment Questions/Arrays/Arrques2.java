package Arrays;

public class Arrques2 {
    public static void main(String[] args) {
        int [] nums = {5,9,7,10,293944,23988004};
        System.out.println(maxf(nums));
    }
    static int maxf(int[] nums){
        int max = nums[0];
        for(int i = 0; i<nums.length;i++){
            if(max<nums[i]){
                max = nums[i];
            }
        }
        return max;
    }
}
