import java.util.*;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
        int m = arr.length;
        int n = arr[0].length;
        int[][] matrix = new int[n][m];
        transpose(arr, matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void transpose(int[][] arr, int[][] matrix) {
        int m = arr.length;
        int n = arr[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[j][i] = arr[i][j];
                }
            }
    }
}
