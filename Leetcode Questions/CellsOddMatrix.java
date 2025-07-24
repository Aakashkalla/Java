public class CellsOddMatrix {
    public static void main(String[] args) {
        int [][]indices = {{0,1},{1,1}};
        System.out.println(oddCells(2, 3, indices));        
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int oddcount = 0;
        int[][] matrix = new int[m][n];
 
        for (int i = 0; i < indices.length; i++) {
            //Row
            int row=indices[i][0];
            for (int j = 0; j < n; j++) {
                matrix[row][j]++;
            }
            //Col
            int col=indices[i][1];
            for (int j = 0; j < m; j++) {
                matrix[j][col] ++;
            }
        }
        for(int k = 0 ; k<m;k++){
            for(int h = 0;h<n;h++){
                if(matrix[k][h]%2!=0){
                    oddcount++; 
                }
            }
        }
        return oddcount;
    }
}
