//Maximum and Minimum of an array
public class Question1 {
    public static void main(String[] args) {
        int[] nums = { 3, 5, 4, 1, 9 };
        System.out.println("Maximum element is:" + maxf(nums));
        System.out.println("Minimum element is:" + minf(nums));
    }

    static int maxf(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    static int minf(int[] nums) {
        int min = nums[0];
        for (int j = 0; j < nums.length; j++) {
            if (nums[j]<min){
                min = nums[j];
            }
        }
        return min;
    }
}
