package wk6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BuiltInInterfaces {
    public static void applyMap(List<Integer> nums,
                                Function<Integer, Integer> func){
        for(Integer i: nums){
            System.out.println(func.apply(i));
        }
    }
    public static void main(String[] args) {
        List<Integer> nums =
                new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));

        nums.stream().map(a -> a * 2).collect(Collectors.toList());
        Function<Integer, Integer> multBy2 = a -> a * 2;
        Function<Integer, Integer> divBy2 = a -> a / 2;
        applyMap(nums, multBy2);
    }
}
