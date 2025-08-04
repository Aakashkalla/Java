public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {11,2,3,4,5,6,1};
        System.out.println(minFind(arr));
    }
    public static int minFind(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
