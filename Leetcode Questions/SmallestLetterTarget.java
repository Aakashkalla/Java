public class SmallestLetterTarget {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        char target = 'h';
        System.out.println(smallestLetter(letters, target));
    }

    public static char smallestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (start == letters.length) {
            return letters[0];
        } else {
            return letters[start];
        }

    }
}
