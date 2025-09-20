import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class SortVowelsInAString {
    public static void main(String[] args) {
        String s = "lEetcOde";
        //"lEOtcede"
        System.out.println(sortVowels(s));
    }
    public static String sortVowels(String s){
        ArrayList<Character> al = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(checkVowel(ch)) al.add(ch);
        }
        Collections.sort(al);
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (char ch: s.toCharArray()){
            if(checkVowel(ch)){
                sb.append(al.get(index));
                index++;
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    static boolean checkVowel(char ch){
        Set<Character> hs = Set.of('A','E','I','O','U','a','e','i','o','u');
        if(hs.contains(ch)) {
            return true;
        }
        else return false;
    }

}
