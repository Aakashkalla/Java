public class ValidWord {
    public static void main(String[] args){
        String word = "AbC234";
        System.out.println(validWord(word));
    }
    public static boolean validWord(String word){
        int vowel = 0;
        int consta = 0;
        if(word.length()<3){
            return false;
        }
        word = word.toLowerCase();
        for(int i = 0;i<word.length();i++){
            if(Character.isDigit(word.charAt(i)) ){
                continue;
            }
            else if(Character.isLetter(word.charAt(i))){
                char ch = word.charAt(i);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowel++;
                }
                else{
                    consta++;
                }
            }
            else{
                return false;
            }
        }
        if(vowel >=1 && consta>=1){
            return true;
        }
        return false;
    }
}
