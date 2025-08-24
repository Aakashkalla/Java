public class RecursionSortedArray {
  public static void main(String[] args){
    int[] arr = {1,2,4,3,5};
    int index = 0;
    System.out.println(sortedArr(arr, index));
  } 
  static boolean sortedArr(int[] arr, int index){
    if(index==arr.length-1){
      return true;
    }
    return arr[index]<arr[index+1] && sortedArr(arr, index+1);
  } 
}
