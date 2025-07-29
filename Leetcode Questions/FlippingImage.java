import java.util.*;
public class FlippingImage {
    public static void main(String[] args){
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
    public static int[][] flipAndInvertImage(int[][] image){
        for(int i = 0;i<image.length;i++){
            int p1 = 0;
            int p2 = image[i].length-1;
            for(int j = 0;j<image[i].length;j++){
                while(p1<=p2){
                    int temp = image[i][p1];
                    image[i][p1] = image[i][p2];
                    image[i][p2] = temp; 
                    p1++;
                    p2--;
                }
                if(image[i][j]==0){
                    image[i][j]=1;
                }
                else{
                    image[i][j]=0;
                }
            }
        }
        return image;
    }
}
