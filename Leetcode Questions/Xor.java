public class Xor {
    public static void main(String[] args){
        int[] nums = {4,1,2,2,1};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums){
        int xor=0;
        for(int i = 0;i<nums.length;i++){
            xor = xor^nums[i];
        }
        return xor; 
    }
}
