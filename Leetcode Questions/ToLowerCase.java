public class ToLowerCase {
    public static void main(String[] args){
        String s = "Hello";
        System.out.println(lowercase(s));
    }

    public static String lowercase(String s){
        StringBuilder s1 = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch=s.charAt(i);
            ch = Character.toLowerCase(ch);
            s1.append(ch);
        }
        return s1.toString();
    }
}
