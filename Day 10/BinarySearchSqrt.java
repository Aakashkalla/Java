public class BinarySearchSqrt {
    public static void main(String[] args){
        int number = 50; 
        int prec = 3;
        System.out.printf("%.3f",binarySqrt(number, prec));
    }
    static double binarySqrt(int number, int prec){
        int start = 0;
        int end = number;
        double root = 0.0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid * mid == number){
                return mid;
            }            
            else if(mid * mid > number){
                end = mid - 1;
            }
            else start = mid + 1;
        }
        
        double incr = 0.1;
        for(int i = 0; i<prec;i++){
            while(root * root <=number){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }

        return root;
    }
}
