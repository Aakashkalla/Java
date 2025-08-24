public class RecursionLinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,67,89};
        int target = 9;
        System.out.println(linearSearch(arr, target, 0));
    }
    static boolean linearSearch(int[] arr, int target, int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || linearSearch(arr, target, index+1);
    }
}
