package wk14.prep;

import java.util.Arrays;

/**
 * Class that implement mergesort
 */
public class MergeSort implements Sort {

    /**
     * Merges the left and right sublists into the table
     * @param table End location/list for the left and right sublist elements
     * @param left Left sublist that is sorted
     * @param right Right sublist that is sorted
     * @param <T> Type of the elements
     */
    public <T extends Comparable<T>> void merge(T[] table, T[] left, T[] right){
        //List<T> ret = new ArrayList<>();
        int i = 0; //po
        int j = 0;
        int k = 0;
        while(i < left.length && j < right.length){
            if(left[i].compareTo(right[j]) < 0){
                table[k++] = left[i++];
            } else {
                table[k++] = right[j++];
            }
        }
        while(i < left.length){
            table[k++] = left[i++];
        }
        while(j < right.length){
            table[k++] = right[j++];
        }
    }

    @Override
    public <T extends Comparable<T>> void sort(T[] table) {
        if(table.length > 1){
            T[] leftSubList =
                    (T[]) new Comparable[table.length/2];
            T[] rightSubList =
                    (T[]) new Comparable[table.length - table.length/2];
            System.arraycopy(table, 0, leftSubList, 0, leftSubList.length);
            System.arraycopy(table, leftSubList.length, rightSubList, 0 , rightSubList.length);
            sort(leftSubList);
            sort(rightSubList);
            merge(table, leftSubList, rightSubList);
        }
    }
    public static void main(String[] args) {
        Integer[] nums = {5, 7, 4, 3, -2, 8, 6, 5, 1, 9, 8};
        Sort sort = new MergeSort();
        System.out.println("Before: ");
        System.out.println(Arrays.toString(nums));
        sort.sort(nums);
        System.out.println("After: ");
        System.out.println(Arrays.toString(nums));
    }
}
