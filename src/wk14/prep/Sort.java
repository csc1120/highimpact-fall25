package wk14.prep;

/**
 * Interface for a sorting algorithm
 */
public interface Sort {
    /**
     * Interface for a sorting functional interface
     * @param table List to sort
     * @param <T> Type of the elements in the list
     */
    <T extends Comparable<T>> void sort(T[] table);
}
