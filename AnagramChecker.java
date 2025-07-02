import java.util.*;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String 1:");
        String str1 = in.nextLine();
        System.out.print("Enter String 2:");
        String str2 = in.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("Yes, they are anagrams.");
        } else {
            System.out.println("No, they are not anagrams.");
        }
    }

    static boolean isAnagram(String s1, String s2) {
        
        if (s1.length() != s2.length()) return false;

        
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        
        return Arrays.equals(arr1, arr2);
    }
}
