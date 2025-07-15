public class SumRecursion {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(rec(n));
        System.out.println(countf(0));
        System.out.println(palindromef("madam", 0, 4));
    }

    public static int rec(int n) {
        if (n == 0)
            return 0;
        int sum = rec(n / 10);
        return sum + n % 10;
    }

    public static int countf(int n) {
        if (n == 0)
            return 0;
        int count = countf(n / 10);
        return count = count + 1;
    }

    public static boolean palindromef(String s, int i, int  j){
        if(i>=j) return true;
        if(s.charAt(i)!=s.charAt(j)) return false;
        return palindromef(s, i+1, j-1);

    }
}