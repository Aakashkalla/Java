public class PowerAB {
    public static void main(String[] args){
        int a = 2;
        int b = 5;

        int ans = 1;
        while(b>0){
            if((b & 1)==1){
                ans*= a;
            }
            a = a * a;
            b = b>>1;

        }
        System.out.println(ans);
    }

}
