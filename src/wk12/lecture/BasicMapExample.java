package wk12.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class BasicMapExample {
    public static void main(String[] args) {
        List<String> words =
                new ArrayList<>(Arrays.asList("foo", "bar", "taco", "cat"));
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        //ListMap<String, Integer> treeMap = new ListMap<>();
        for(int i = 0; i<words.size(); i++){
            treeMap.put(words.get(i), words.get(i).length());
        }
        System.out.println("Tree map before");
        System.out.println(treeMap);

        System.out.println("Tree map after change value of taco");
        treeMap.put("taco", 42);
        System.out.println(treeMap);

        System.out.println("Getting the value for cat");
        System.out.println(treeMap.get("cat"));

        treeMap.remove("bar");
        System.out.println("Treemap after removing entry for bar");
        System.out.println(treeMap);
    }
}
