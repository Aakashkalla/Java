public class OrderAgnosticBinarySearch {
    public static void main(String[] args){
        // int[] arr = {1,2,4,5,8,9};
        int[] arr2 = {9,7,5,4,3,2};
        int target = 9;
        int start = 0;
        int end = arr2.length-1;
        if(arr2[start]>arr2[end]){
            int ans = descBinarySearch(arr2, target);
            System.out.println(ans);
        }
        else{
            int ans = ascBinarySearch(arr2, target);
            System.out.println(ans);
        }
    }
    public static int ascBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + ((end-start)/2);
            if(target==arr[mid]) return mid;
            else if (target>arr[mid]) start = mid + 1;
            else end = mid-1;
        }
        return -1;
    }

    public static int descBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + ((end-start)/2);
            if(target==arr[mid]) return mid;
            else if (target>arr[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
