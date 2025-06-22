import java.util.*;

public class Candies {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        System.out.println(kidsWithCandies(arr, 3));
    }   
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res=new ArrayList<>();
        int max =Integer.MIN_VALUE;
        for(int i = 0 ; i<candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int i = 0; i<candies.length;i++){
            if(candies[i] + extraCandies >= max){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}
