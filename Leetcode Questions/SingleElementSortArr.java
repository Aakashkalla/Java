public class SingleElementSortArr {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(singleElement(nums));
    }

    static int singleElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        if (nums.length == 1)
            return nums[0];
        if (nums[start] != nums[start + 1])
            return nums[start];
        if (nums[end] != nums[end - 1])
            return nums[end];
        start = start + 1;
        end = end - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[start];
    }
}
