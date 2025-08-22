public class Factor {
    public static void main(String[] args){
        int n = 20;
        // factorBrute(n);
        factorOptimal(n);
    }   
    
    static void factorBrute(int n){
        for(int i = 1;i<=n;i++){
            if(n%i==0) System.out.print(i + " ");
        }
    }

    static void factorOptimal(int n){
        for(int i = 1;i<=Math.sqrt(n);i++){
            if(n%i==0) System.out.print(i + " " + n/i + " ");
        }
    }
}
