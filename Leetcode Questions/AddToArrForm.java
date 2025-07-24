import java.util.*;
public class AddToArrForm {
    public static void main(String[] args){
        int k =0;
        int[] nums = {1,2,3,4};
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = nums.length-1;i>0;i--){
            k = k + nums[i];
            a.add(k%10);
            k = k/10;
        }
        while(k>0){
            a.add(k%10);
            k=k/10;
        }
    }
    
}
