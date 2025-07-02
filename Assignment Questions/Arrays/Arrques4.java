package Arrays;

public class Arrques4 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 8, 10, 13, 15 };
        countf(arr);
    }

    static void countf(int[] arr) {
        int ce = 0;
        int co = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                co++;
            } else {
                ce++;
            }
        }
        System.out.println("Even numbers: " + ce);
        System.out.println("Odd numbers: " + co);
    }
}
