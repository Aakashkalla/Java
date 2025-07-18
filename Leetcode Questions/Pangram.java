import java.util.*;
public class Pangram {
    public static void main(String[] args){
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(pangram(s));
    }
    public static boolean pangram(String s){
        Set<Character> hash = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            hash.add(ch); 
        }
        if(hash.size()==26){
            return true;
        }
        return false;
    }
}
