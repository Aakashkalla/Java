import java.util.*;
public class PartitionArr {
    public static void main(String[] args){
        int[] nums ={9,12,5,10,14,3,10};
        System.out.println(Arrays.toString(partarr(nums, 10)));
    }
    public static int[] partarr(int[] nums, int pivot){
        List<Integer> smaller = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> larger = new ArrayList<>();
        int[] sorted = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<pivot){
                smaller.add(nums[i]);
            }
            else if(nums[i]>pivot){
                larger.add(nums[i]);
            }
            else{
            equal.add(nums[i]);
            }
        }
        smaller.addAll(equal);
        smaller.addAll(larger);

        for(int j =0;j<smaller.size();j++){
            sorted[j] = smaller.get(j);
        }

        return sorted;
    }
}
