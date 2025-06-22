// Small numbers than number in array.

import java.util.Arrays;

public class Question16 {
    public static void main(String[] args) {
        int [] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(func(arr)));
    }
    static int[] func(int [] arr){
        int [] count = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
            int freq = 0;
            for(int j = 0; j<arr.length;j++){
                if(arr[j]<arr[i] && j!=i){
                    freq++;
                }
            }
            count[i]=freq;
        }
        return count;
    }
}
