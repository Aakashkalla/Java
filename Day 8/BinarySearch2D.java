import java.util.*;
public class BinarySearch2D {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 7;
        int[] ans = bs2D(matrix, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] bs2D(int[][] matrix, int target){
        int r = 0;
        int c =  matrix.length-1;
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[] {r,c};
            }
            else if(matrix[r][c]>target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[] {-1,-1};
    }    
}
