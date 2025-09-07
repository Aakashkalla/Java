import java.util.HashMap;

public class IsomorphicString{
    public static void main(String[] args) {
        
    }
    static boolean isIso(String s, String t){
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();

        for(int i=0; i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(smap.containsKey(c1)){
                if(!smap.get(c1).equals(c2)){
                    return false;
                }
            }
            else{
                smap.put(c1, c2);
            }
            
            if(tmap.containsKey(c2)){
                if(!tmap.get(c2).equals(c1)){
                    return false;
                }
            }
            else{
                tmap.put(c2, c1);
            }
        }

        return true;
    }
}