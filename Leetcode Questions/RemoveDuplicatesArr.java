public class RemoveDuplicatesArr {
    public static void main(String[] args){

    }
    public static int duplicate(int[] nums){
        int p1=1;
        int p2=1;
        while(p1<nums.length){
            if(nums[p1]!=nums[p1-1]){
                nums[p2] = nums[p1];
                p2++;
            }
            p1++;


        }
        return p2;
    }
}
