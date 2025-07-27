public class HillValley {
    public static void main(String[] args){
        int[] nums = {2,4,1,1,6,5};
        System.out.println(hillValley(nums));
    }
    public static int hillValley(int[] nums){
        int count = 0;
        int i = 0;
        for(int j = 0;j<=nums.length-2;j++){
            if((nums[i]<nums[j] && nums[j+1]<nums[j]) || (nums[i]>nums[j] && nums[j+1]>nums[j])){
                count++;
                i=j;
            }
        }
        return count;
    }
}
