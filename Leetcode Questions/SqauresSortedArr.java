import java.util.Arrays;
public class SqauresSortedArr {
    public static void main(String[] args){
        int[] nums ={-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums){
        for(int i =0;i<nums.length;i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
