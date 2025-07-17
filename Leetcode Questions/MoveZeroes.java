import java.util.*;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        movezerof(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void movezerof(int[] nums) {
        int left = 0;
        int right = 1;

        while (right < nums.length) {
            if (nums[right] != 0 && nums[left] == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            } else if (nums[left] != 0) {
                left++;
            }
            right++;
        }
    }
}