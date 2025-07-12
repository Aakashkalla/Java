public class Loops {
    public static void main(String[] args) {
        for(int i = 1;i<6;i++){
        for(int j = 1;j<=i;j++){
        System.out.print("* ");
        }
        System.out.println("");
        }

        for(int i =0;i<=7;i++){
        int n = 1;
        for(int j = 0;j<=i;j++){
        System.out.print(n + " ");
        n++;
        }
        System.out.println("");
        }

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println("");
        }
        
        int n = 5;
        for (int i = 0; i < n; i++) {
            for(int j=n;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 5;i>0;i--){
            for(int j =0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i =0;i<3;i++){
            for(int j=0;j<3-i-1;j++){
                System.out.print("  ");
            }
            for(int j = 0;j<2*i+1;j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }    
        for(int i =0;i<2;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("  ");
            }
            for(int j = 0;j<(2-i)*2-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        
    }
}
