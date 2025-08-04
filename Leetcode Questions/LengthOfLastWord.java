public class LengthOfLastWord {
    public static void main(String[] args){
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s){
        int count = 0;
        int i = s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && Character.isLetter(s.charAt(i))){
            count++;
            i--;
        }
        return count;
        
    }
}
