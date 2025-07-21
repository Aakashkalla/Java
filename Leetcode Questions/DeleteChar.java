public class DeleteChar {
    public static void main(String[] args) {
        String s = "aaabaaa";
        System.out.println(fancy(s));
    }

    public static String fancy(String s) {
        StringBuilder sb= new StringBuilder();
        for(int i =0;i<s.length()-2;i++){
        char ch1 = s.charAt(i);
        char ch2 = s.charAt(i+1);
        char ch3 = s.charAt(i+2);
        if(ch1==ch2 && ch1==ch3){
        continue;
        }
        else{
        sb.append(ch1);
        }

        }
        sb.append(s.charAt(s.length()-2));
        sb.append(s.charAt(s.length()-1));
        return sb.toString();
        
    }
}