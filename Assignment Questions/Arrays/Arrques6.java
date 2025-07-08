package Arrays;

import java.util.*;

public class Arrques6 {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();

        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "lenovo"));
        items.add(Arrays.asList("phone", "gold", "iphone"));
        String ruleKey = "type";
        String ruleValue = "phone";
        int index;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2;
        }
        for (int i = 0; i < items.size(); i++) {
            if (ruleValue.equals(items.get(i).get(index))) {
                System.out.println(items.get(i));
            }
        }
    }
    public int countMatches(List<List<String>> items,String ruleKey,String ruleValue){
        int count = 0;
        int index;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2;
        }
        for (int i = 0; i < items.size(); i++) {
            if (ruleValue.equals(items.get(i).get(index))) {
                count++;
            }
        }
        return count;
    }
}
