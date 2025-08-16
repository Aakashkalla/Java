public class ProductRecursion {
    public static void main(String[] args){
        System.out.println(prdRec(7));
    }
    static int prdRec(int n){
        if(n<=1){
            return 1;
        }
        return  n * prdRec(n-1);
    }
}
