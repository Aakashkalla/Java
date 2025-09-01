import java.util.*;

public class InterSectionOfTwoArrays {
    public static void main(String[] args){
        int[] nums1 = {4,9,5};
        int[] nums2 = {6,7,8,3,4,5,9};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        int p1 = 0;
        int p2 = 0;
        while(p1<nums1.length && p2<nums2.length){
            if(nums1[p1]==nums2[p2]){
                list.add(nums1[p1]);
                p1++;
                p2++;
            }
            else if(nums1[p1]>nums2[p2]){
                p2++;
            }
            else {
                p1++;
            }
            
        }
        int[] intersection = new int[list.size()];
        for(int  i = 0;i<list.size();i++){
            intersection[i] = list.get(i);
        }
        return intersection;
    }
}
