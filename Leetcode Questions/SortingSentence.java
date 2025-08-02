import java.util.*;
public class SortingSentence {
    public static void main(String[] args){
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }
    public static String sortSentence(String s){
        String[] strarr = s.split(" ");
        String[] newArr = new String[strarr.length];
        for(int i = 0;i<strarr.length;i++){
            String word = strarr[i].substring(0,strarr[i].length()-1);
            char digit = strarr[i].charAt(strarr[i].length()-1);
            int index = Integer.parseInt(String.valueOf(digit));
            newArr[index-1] = word;
        }
        return String.join(" ",newArr);
    }
}
