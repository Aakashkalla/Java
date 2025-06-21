import java.util.Arrays;

public class ShuffleArr {
    public static void main(String[] args) {
        int[] nums = {2,3,5,4,1,7};
        int n=3;
        System.out.println(Arrays.toString(shuffle(nums,n)));                     
    }
    static int[] shuffle(int[] nums, int n) {
        int left = 0 ;
        int right = n;
        int[] arr = new int[2*n];
        // for(int i = 0; i<nums.length;i+=2){
        //     arr[i]=nums[left];
        //     arr[i+1]=nums[right];
        //     left++;
        //     right++;
        // }
        int e = 0;
        while(e<nums.length){
            arr[e]=nums[left];
            arr[e+1]=nums[right];
            left++;
            right++;
            e+=2;
        }
        return arr;    
    }
}
