//Used to understand pass by reference
import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=99;
    }
}
