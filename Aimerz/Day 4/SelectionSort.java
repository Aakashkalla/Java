import java.util.*;
public class SelectionSort {
    public static void main(String[] args){
        int[] arr= {6,10,34,22,454,3};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionsort(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int smallIndex = i;

            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[smallIndex]){
                    smallIndex=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallIndex];
            arr[smallIndex] = temp;
        }   
    }
}
