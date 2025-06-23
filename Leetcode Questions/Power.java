public class Power {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(check(n));
    }
    static boolean check(int n){
        while(n>0){
            if(n==1){
                return true;
            }
            if(n%4!=0){
                break;
            }
            n = n/4;
        }
        return  false;
    
    }    
}
