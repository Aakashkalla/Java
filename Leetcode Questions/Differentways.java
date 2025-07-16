import java.util.ArrayList;
import java.util.List;

public class Differentways {
    public static void main(String[] args){
        System.out.println(compute("2-1-1"));
    }
    public static List<Integer> compute(String expression){
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i<expression.length();i++){
            char c = expression.charAt(i);
            if(c=='+' || c=='-' || c=='*'){
                List<Integer> left = compute(expression.substring(0,i));
                List<Integer> right = compute(expression.substring(i+1));
                for(int l : left){
                    for(int r : right){
                        if(c=='*') ans.add(l*r);
                        else if(c=='+') ans.add(l+r);
                        else ans.add(l-r);
                    }
                }
            }
        }
        if (ans.size()==0) ans.add(Integer.valueOf(expression));
        return ans;
    }
    public static List<Integer> diffWaysToCompute(String expression) {
        return compute(expression);
    }
}
