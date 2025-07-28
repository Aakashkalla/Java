import java.util.*;
public class MinABSDiff {
    public static void main(String[] args){
        int[] arr = {4,2,3,1};
        System.out.println(miniAbsDIFF(arr));
    }
    public static List<List<Integer>> miniAbsDIFF(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int mindiff = Integer.MAX_VALUE;

        for(int i = 1;i<arr.length;i++){
            mindiff = Math.min(mindiff,arr[i]-arr[i-1]);
        }
        for(int j=1;j<arr.length;j++){
            if(arr[j]-arr[j-1]==mindiff){
                ans.add(List.of(arr[j-1],arr[j]));
            }
        }
        return ans;
    }
}
