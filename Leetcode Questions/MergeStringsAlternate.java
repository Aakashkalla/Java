public class MergeStringsAlternate {
    public static void main(String[] args){
        String word1 = "abcc";
        String word2 = "pqrdaaa";
        System.out.println(mergeString(word1, word2));
    }
    public static String mergeString(String word1, String word2){
        StringBuilder sb = new StringBuilder();
        int p1 = 0;
        int p2 = 0;
        while(p1<word1.length() && p2<word2.length()){
            sb.append(word1.charAt(p1));
            sb.append(word2.charAt(p2));
            p1++;
            p2++;
        }
        if(p1==word1.length()){
            sb.append(word2.substring(p1,word2.length()));
        }
        sb.append(word1.substring(p2, word1.length()));
        return sb.toString();
    }
}
