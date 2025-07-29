public class MaxConsecOne {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(maxconseOne(nums));
    }

    public static int maxconseOne(int[] nums) {
        int count = 0;
        int maxcount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxcount = Math.max(maxcount, count);
                count = 0;
            }
        }
        return Math.max(maxcount, count);
    }
}
