public class CheckArraySortedOrNot {
    public static void main(String[] args){
        int[] nums= {3,4,5,1,2};
        System.out.println(checkArr(nums));
    }
    public static boolean checkArr(int[] nums){
        int count = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
        }
        if(nums[nums.length-1]>nums[0]){
            count++;
        }
        if(count>=2){
            return false;
        }
        else{
            return true;
        }
    }
}
