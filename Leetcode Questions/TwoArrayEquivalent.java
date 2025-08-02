public class TwoArrayEquivalent {
    public static void main(String[] args){
        String[] word1 = {"abc", "d","defg"};
        String[] word2 = {"abcddefg"};
        System.out.println(arrayEquivalent(word1, word2));
    }
    public static boolean arrayEquivalent(String[] word1, String[] word2){
        String newString1 = String.join("",word1);
        String newString2 = String.join("",word2);
        if(newString1.equals(newString2)){
            return true;
        }
        return false;
    }
}
