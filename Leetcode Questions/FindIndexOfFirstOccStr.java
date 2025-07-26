public class FindIndexOfFirstOccStr {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "leeto";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int l = 0;
        int r = 0;
        while (l < haystack.length()) {
            if (haystack.charAt(l) == needle.charAt(r)) {
                l++;
                r++;

            } else {
                l++;
                r = 0;
            }

            if (r == needle.length() - 1) {
                return l - r;
            }
        }

        return -1;
    }
}
