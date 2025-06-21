import java.util.*;
public class NumGoodPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<nums.length;i++){
            nums[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j=1+i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
}
