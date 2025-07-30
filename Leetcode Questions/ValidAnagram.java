import java.util.*;
public class ValidAnagram {
    public static void main(String[] args){
        String s = "cat";
        String t = "atc";
        System.out.println(validAnagram(s, t));
    }
    public static boolean validAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }

        char [] ch1 = s.toCharArray();
        char [] ch2 = t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }
}
