import java.util.Arrays;

public class ArrayF {
    public static void main(String[] args) {
        int[] nums = {20,30,40,50};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0]=99;
        arr[2]=100;
    }
}
