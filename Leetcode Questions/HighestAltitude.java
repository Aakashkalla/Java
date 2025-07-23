public class HighestAltitude {
    public static void main(String[] args){
        int [] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAlt(gain));
    }
    public static int largestAlt(int[] gain){
        int sum = 0;
        int max = 0;
        for(int i = 0;i<gain.length;i++){
            sum  = sum + gain[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}
