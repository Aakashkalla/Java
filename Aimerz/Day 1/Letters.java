public class Letters {
    public static void main(String[] args){
        // Printing AIMERZ USING STAR PATTERN:
        for(int i = 0;i<5;i++){
            for(int j =0 ;j<5;j++){
                if((i==2 || i==3 || i==4) && (j==0 || j==4)){
                    System.out.print("* ");
                }
                else if((i==1 || i==2) && (j==1 || j==3)){
                    System.out.print("* ");
                }
                else if((i==0 || i==2) && (j==2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");

            for(int j = 0;j<5;j++){
                if((i==0 || i==4) && j==0){
                    System.out.print("* ");
                }
                else if((i==0 || i==4) && j==1){
                    System.out.print("* ");
                }
                else if(j==2 && (i==0 || i==1 || i==2 ||i==3 || i==4)){
                    System.out.print("* ");
                }
                else if((i==0 || i==4) && (j==3 || j==4) ){
                    System.out.print("* ");
                }
                
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");
            for(int j = 0;j<5;j++){
                if((i==0 || i==1 || i==2 || i==3 || i==4 )&& (j==0 || j==4)){
                    System.out.print("* ");
                }
                else if(i==1 && (j==1 || j==3)){
                    System.out.print("* ");
                }
                else if(i==2 && j==2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("   ");
            for(int j =0;j<5;j++){
                if((i==0 || i==1 || i==2 || i==3 || i==4)&& j==0){
                    System.out.print("* ");
                }
                else if((i==0 || i==2 || i==4) && (j==0 || j==1 || j==2 ||j==3 || j==4 )){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            
            System.out.print("   ");
            for(int j =0;j<5;j++){
                if((i==0 || i==1 || i==2 || i==3 || i==4) && j==0){
                    System.out.print("* ");
                }
                else if((i==0 || i==2) && j==1){
                    System.out.print("* ");
                }
                else if((i==0 || i==1 || i==3) && j==2){
                    System.out.print("* ");   
                }
                else if((i==0 || i==4) && j==3){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.print("   ");
            for(int j =0;j<5;j++){
                if((i==0 || i==4)&& (j==0 || j==1 || j==2 || j==3 ||j==4)){
                    System.out.print("* ");
                }
                else if((i==1 && j==3) || (i==2 && j==2) || (i==3 && j==1)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
