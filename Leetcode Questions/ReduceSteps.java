public class ReduceSteps {
    public static void main(String[] args){
        int n =0;
        System.out.println(reducenum(n));
    }
    public static int reducenum(int n){
        int count =0;
        while(n!=0){
            if(n%2==0){
                n=n/2;
                count++;
            }
            else{
                n=n-1;
                count++;
            }
        }
        return count;
    }
}
