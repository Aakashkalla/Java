import java.util.ArrayList;

public class RecursionIndexAL {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 56, 6, 4, 8, 9, 4 };
        int target = 4;
        System.out.println(indexAl(arr, target, 0));
    }

    static ArrayList<Integer> indexAl(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ans = indexAl(arr, target, index+1);
        list.addAll(ans);
        return list;
    }
}
