public class StringPalindrome {
    public static void main(String[] args){
        String s = "atta";
        System.out.println(palindromeString(s));
    }
    public static boolean palindromeString(String s){
        if(s.length()==0 || s ==null){
            return false;
        }
        s = s.toLowerCase();
        int p1 = 0;
        int p2 = s.length()-1;
        while(p1<p2){
            if(s.charAt(p1)==(s.charAt(p2))){
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
