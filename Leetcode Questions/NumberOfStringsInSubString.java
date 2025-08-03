public class NumberOfStringsInSubString {
    public static void main(String[] args){
        String[] patterns = {"a","a","a"};
        String word = "aaaaabbb";
        System.out.println(numOfString(patterns, word));
    }

    public static int numOfString(String[] patterns, String word){
        int count = 0;
        for(int i = 0;i<patterns.length;i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }
}
