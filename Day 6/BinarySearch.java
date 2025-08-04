public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {2,3,5,7,9,11,15,19,20,26,27,29,35};
        int target = 19;
        int answer = binarySearch(arr, target);
        System.out.println(answer);
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            } 
            else if(arr[mid]>target){
                end = mid - 1;
            }
            else start = mid+1;
        }
        return -1;
    }
}
