public class NumberOfSetBits {
    public static void main(String[] args){
        int n = 13;
        int count = 0;
        System.out.println(Integer.toBinaryString(n));
        while(n>0){
            if((n&1)==1) count ++;
            n = n >> 1;
        }
        System.out.println(count);
    }
}
