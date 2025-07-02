
import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = in.nextInt();
        int [] num1 = new int[n];
        for (int i = 0; i<n;i++){
            System.out.print("Enter element:");
            int number = in.nextInt();
            num1[i] = number;
        }
        System.out.println(Arrays.toString(num1));
        ArrayList<Integer> duplicate = Duplicates(num1);
        System.out.println("Duplicate elements: " + duplicate);
    }

    static ArrayList<Integer> Duplicates(int[] num1) {
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < num1.length; i++) {
            boolean alreadyAdded = false;

            
            for (int k = 0; k < duplicates.size(); k++) {
                if (num1[i] == duplicates.get(k)) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (alreadyAdded) continue;

            for (int j = i + 1; j < num1.length; j++) {
                if (num1[i] == num1[j]) {
                    duplicates.add(num1[i]);
                    break;
                }
            }
        }

        return duplicates;
    }
}
