public class LargestThreeSubString {
    public static void main(String[] args) {
        String nums = "6777133339";
        System.out.println(largestSubString(nums));
    }

    public static String largestSubString(String nums) {
        StringBuilder max = new StringBuilder();
        int p1 = 0;
        while (p1 + 3 <= nums.length()) {
            if (nums.charAt(p1) == nums.charAt(p1 + 1) && nums.charAt(p1) == nums.charAt(p1 + 2)) {
                String currString = nums.substring(p1, p1 + 3);
                if (currString.compareTo(max.toString()) > 0) {
                    max.setLength(0);
                    max.append(currString);
                }

            }
            p1++;
        }
        return max.toString();

    }
}
