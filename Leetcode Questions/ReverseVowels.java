import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
    public static void main(String[] args){
        String s = "AbcCreaM";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s){
        char[] charArray = s.toCharArray();
        int p1 = 0;
        int p2 = charArray.length-1;
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u','A','E','I','O','U'));
        while(p1<p2){
            while(p1<p2 && !vowels.contains(charArray[p1])){
                p1++;
            }
            while(p1<p2 && !vowels.contains(charArray[p2])){
                p2--;
            }
            if(p1<p2){
                char temp = charArray[p1];
                charArray[p1] = charArray[p2];
                charArray[p2] = temp;
                p1++;
                p2--;
            }
        }
        String newString = new String(charArray);
        return newString;  
    }
}
