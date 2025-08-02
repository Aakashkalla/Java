import java.util.*;
public class GoalParserInterp {
    public static void main(String[] args){
        String s = "G()(al)";
        System.out.println(interpret(s));
    }
    public static String interpret(String command){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<command.length()-2;i++){
            if(command.charAt(i)=='G'){
                sb.append("G");
            }
            else if(command.substring(i, i+2).equals("()")) {
                sb.append("o");
                i =i +2;
            }
            else sb.append("al");
        }
        
        return sb.toString();
    }
}
