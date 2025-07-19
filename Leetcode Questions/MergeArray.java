    import java.util.*;
    public class MergeArray {
        public static void main(String[] args){
            int[] nums1={1,2,3,0,0,0};
            int[] nums2={2,5,6};
            int m = 3;
            int n = 3;
            mergeArr(nums1, nums2, m, n);
            System.out.println(Arrays.toString(nums1));
        }
        public static int[] mergeArr(int[] nums1, int[] nums2, int m, int n){
            int start = m-1;
            int end = n-1;
            int p = m+n-1;

            while(end>=0){
                if( start>=0 &&nums1[start]>nums2[end]){
                    nums1[p] = nums1[start];
                    start--;
                }
                else{
                    nums1[p]= nums2[end];
                    end--;
                }
                p--;
            }
            return nums1;
        } 
    }
