import java.util.*;
public class Question5 {
    public static void main(String[] args){
        int[] arr = {7,3,2,4,9,12,56};
        int m = 5;
        System.out.println(minDiff(arr,m));
    }
    public static int minDiff(int[] arr,int m){
        Arrays.sort(arr);
        int n = arr.length;
        int mindiff = Integer.MAX_VALUE;
        for(int i = 0; i+m-1<n;i++){
            int diff = arr[i+m-1]-arr[i];

            if(mindiff>diff){
                mindiff=diff;
            }
        }
        return mindiff;
    }
}
