package wk14.prep;

import java.util.Arrays;

/**
 * Class that implements insertion sort
 */
public class InsertionSort implements Sort {

    @Override
    public <T extends Comparable<T>> void sort(T[] table) {
        for(int i = 1; i<table.length; i++){
            int nextPos = i;
            T nextVal = table[nextPos];
            while(nextPos > 0 && nextVal.compareTo(table[nextPos-1])<0) {
                table[nextPos] = table[nextPos - 1];
                nextPos--;
            }
            table[nextPos] = nextVal;
        }
    }
    public static void main(String[] args) {
        Integer[] nums = {5, 7, 4, 3, -2, 8, 6, 5, 1, 9, 8};
        Sort sort = new InsertionSort();
        System.out.println("Before: ");
        System.out.println(Arrays.toString(nums));
        sort.sort(nums);
        System.out.println("After: ");
        System.out.println(Arrays.toString(nums));
    }
}
