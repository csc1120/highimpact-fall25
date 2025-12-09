package wk14.prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class that implements selection sort
 */
public class SelectionSort implements Sort {

    @Override
    public <T extends Comparable<T>> void sort(T[] table) {
        for(int i = 0; i<table.length; i++){
            T min = table[i];
            int minIndex = i;
            for(int j = i + 1; j<table.length; j++){
                if(table[j].compareTo(min) < 0){
                    minIndex = j;
                    min = table[minIndex];
                }
            }
            //swap elements at i and minIndex
            T temp = table[i];
            table[i] = min;
            table[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] nums = {5, 7, 4, 3, -2, 8, 6, 5, 1, 9, 8};
        Sort sort = new SelectionSort();
        System.out.println("Before: ");
        System.out.println(Arrays.toString(nums));
        sort.sort(nums);
        System.out.println("After: ");
        System.out.println(Arrays.toString(nums));
    }
}
