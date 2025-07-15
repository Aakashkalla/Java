public class Recursion {
    public static void main(String[] args){
        // int result = factorial(7);
        // System.out.println(result);
        int[] arr = {23,454,532,4553,2345,33,3234};
        printarr(arr,arr.length-1);
        printarrf2(arr, 0);
    }

    // public static int factorial(int n){
        
    //     // Base condition 
    //     if(n==0 || n==1){
    //         return 1;
    //     }
    //     return n*factorial(n-1);
    // }
    public static void printarr(int[] arr,int index){
        if(index<0){
            return;
        }
        
        System.out.println(arr[index]);

        printarr(arr,index-1);
    }

    public static void printarrf2(int[] arr, int index){
        if(index>=arr.length){
            return;
        }
        
        printarrf2(arr,index+1);
        
        System.out.println(arr[index]);
    }
}
