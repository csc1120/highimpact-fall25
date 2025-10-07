package wk6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalInterfaceExample {
    public static void applyToList(List<Integer> nums,
                                   ListOperation operation){
        operation.apply(nums);
    }

    public static void main(String[] args) {

        List<Integer> nums =
                new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));

        ListOperation addTogether = (a) -> {
            int sum = 0;
            for(Integer i: a){
                sum += i;
            }
            System.out.println(sum);
        };
        applyToList(nums, addTogether);
        //add all the numbers together
        //multiple by a constant
        applyToList(nums, FunctionalInterfaceExample::multipleBy);
        //convert to Strings/chars and make a word
        applyToList(nums, new NumsToChars());
        //reverse the list
    }
    public static class NumsToChars implements ListOperation{
        public void apply(List<Integer> nums){
            for(Integer i: nums){
                System.out.println((char)((int)i));
            }
        }
    }
    public static void multipleBy(List<Integer> nums){
        int m = 3;
        for(Integer i: nums){
            System.out.println(i * 3);
        }
    }
}
