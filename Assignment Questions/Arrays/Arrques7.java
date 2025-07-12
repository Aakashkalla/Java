package Arrays;
import java.util.Arrays;
public class Arrques7 {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(sumf(nums)));
    }
    public static int[] sumf(int[] nums){
        int[] sum =new int[nums.length];
        sum[0]=nums[0];
        for(int i = 1;i<nums.length;i++){
            sum[i] = nums[i] + sum[i-1]; 
        }
        return sum;
    } 
}
