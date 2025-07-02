import java.util.*;

public class DuplicateFinderBrute {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 3, 2, 5,6 , 6 ,6 , 8,  8, 2, 8 ,8};
        ArrayList<Integer> duplicate = Duplicates(nums);
        System.out.println("Duplicate elements: " + duplicate);
    }

    static ArrayList<Integer> Duplicates(int[] nums) {
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            boolean alreadyAdded = false;

            
            for (int k = 0; k < duplicates.size(); k++) {
                if (nums[i] == duplicates.get(k)) {
                    alreadyAdded = true;
                    break;
                }
            }

            if (alreadyAdded) continue;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    duplicates.add(nums[i]);
                    break;
                }
            }
        }

        return duplicates;
    }
}
