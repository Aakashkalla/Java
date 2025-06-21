import java.util.*;
public class DiagonalMat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] mat = new int[n][m]; 
        for(int i = 0; i<n;i++){
            for(int j = 0;j<m;j++){
                mat[i][j] = in.nextInt();
            }
        }
        System.out.println(diagonalSum(mat));
    }
     static int diagonalSum(int[][] mat) {
        int lf = 0;
        int rg = 0;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat.length;j++){
                if(i==j){
                    lf+=mat[i][j];
                }
                if(i+j==mat.length-1 && i!=j){
                    rg+=mat[i][j];
                }
            }
        }
        return lf + rg;
    }
}
