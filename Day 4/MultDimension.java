import java.util.*;

public class MultDimension {
    public static void main(String[] args) {
        // 2D Array
        int[][] num = {
                { 1, 2, 3 },
                { 4, 5 },
                { 6, 7, 8, 9 }
        };
        System.out.println(Arrays.toString(num[2]));

        // Input and Output of 2D Arrays
        Scanner input = new Scanner(System.in);
        int[][] nums = new int[3][3];

        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                nums[row][col] = input.nextInt();
            }
        }

        for (int row = 0; row < nums.length; row++) {
            System.out.println(Arrays.toString(nums[row]));
        }
        System.out.println(" ");
        
        //Enhanced For loop
        for(int[] a :nums){
            System.out.println(Arrays.toString(a));
        }
    }
}
