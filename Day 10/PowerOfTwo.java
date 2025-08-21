public class PowerOfTwo {
    public static void main(String[] args){
        int n = 6;
        System.out.println(powerOf2(n));
    }
    static boolean powerOf2(int n){
        if(n<=0){
            return false;
        }
        return ((n & n-1)==0);
    }

}
