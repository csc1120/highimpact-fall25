package wk14.prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> nums =
                new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        System.out.println(nums.stream().map(x -> x * 2).toList().toString());

        //nums.stream().map(x -> x * 2)
    }
}
