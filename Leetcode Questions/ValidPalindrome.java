public class ValidPalindrome {
    public static void main(String[] args){

    }
    public static boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))) sb.append(Character.toLowerCase(s.charAt(i)));
        }
        String newstring = sb.toString();

        int p1 =0;
        int p2 = newstring.length()-1;
        while(p1<p2){
            if(newstring.charAt(p1)==(newstring.charAt(p2))){
                p1++;
                p2--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
