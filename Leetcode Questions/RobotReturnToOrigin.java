public class RobotReturnToOrigin {
    public static void main(String[] args){
        String moves = "UDLR";
        System.out.println(returnOrigin(moves));
    }
    public static boolean returnOrigin(String moves){
        int updown_count = 0;
        int rightleft_count = 0;
        for(int i = 0; i<moves.length();i++){
            if(moves.charAt(i)=='U') updown_count++;
            if(moves.charAt(i)=='D') updown_count--;
            if(moves.charAt(i)=='R') rightleft_count++; 
            if(moves.charAt(i)=='L') rightleft_count--; 
        }
        if(updown_count==0 && rightleft_count==0){
            return true;
        }
        return false;
    }
}
