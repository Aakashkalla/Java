import java.util.*;

public class Duplicates {
    public static void main(String[] args){
        int[] nums = {1,2,3,5};
        System.out.println(duplicate(nums));
    }
    public static boolean duplicate(int[] nums){
        // Arrays.sort(nums);
        // for(int i = 0;i<nums.length-1;i++ ){
        //     if(nums[i]==nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0 ; i<nums.length;i++){
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
            }
            else{
                return true;
            }
        }
        return false;   
    }
}
