package wk14.prep;

import java.util.Arrays;

/**
 * Class that implements shell sort
 */
public class ShellSort implements Sort {
    @Override
    public <T extends Comparable<T>> void sort(T[] table) {
        int gap = table.length/2;
        do {
            for (int i = gap; i < table.length; i++) {
                int nextPos = i;
                T nextValue = table[nextPos];
                while(nextPos > gap - 1 &&
                        nextValue.compareTo(table[nextPos - gap]) < 0) {
                    table[nextPos] = table[nextPos - gap];
                    nextPos = nextPos - gap;
                }
                table[nextPos] = nextValue;
            }
            gap = gap / 2;
        } while (gap >= 1);
    }
    public static void main(String[] args) {
        Integer[] nums = {5, 7, 4, 3, -2, 8, 6, 5, 1, 9, 8};
        Sort sort = new ShellSort();
        System.out.println("Before: ");
        System.out.println(Arrays.toString(nums));
        sort.sort(nums);
        System.out.println("After: ");
        System.out.println(Arrays.toString(nums));
    }
}