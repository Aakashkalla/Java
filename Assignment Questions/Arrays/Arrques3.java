package Arrays;

public class Arrques3 {
    public static void main(String[] args) {
        int [] arr ={2,4,6,22,344,4553,4,3};
        int x = 3;
        System.out.println(numf(arr,x));
    }
    static boolean numf(int[] arr, int x){
        for(int i = 0 ; i<arr.length;i++){
            if(x==arr[i]){
                return true;
            }
        }
        return false;
    }
}
