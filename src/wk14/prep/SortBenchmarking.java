package wk14.prep;

import java.util.Random;

/**
 * Class that does benchmarking on different types of
 * sorts for different orderings of lists
 */
public class SortBenchmarking {
    /**
     * Generates an array of random numbers in different orderings
     * @param size number of elements in the array
     * @param max max value of the elements in the array
     * @param type ordering of the array: random, ascending, or descending
     * @return Array of random numbers
     */
    public static Integer[] generateList(int size, int max, String type){
        Random random = new Random();
        Integer[] ret = new Integer[size];
        for(int i = 0; i<size; i++) {
            if (type.equals("random")) {
                ret[i] = random.nextInt(0, max);
            } else if(type.equals("ascending")){
                ret[i] = i;
            } else {
                ret[i] = size - i - 1;
            }
        }
        return ret;
    }
    public static void benchmarkTest(Sort sort, int numValues, String ordering){
        long start;
        long elapse;
        final int max = 1000;

        start = System.nanoTime();
        sort.sort(generateList(numValues, max, ordering));
        elapse = System.nanoTime() - start;
        System.out.printf("Number values: %d. Ordering %s. ", numValues, ordering);
        System.out.printf("\n\tElapse time:%,15d ns\n", elapse);
    }
    public static void main(String[] args) {
        Sort selection = new SelectionSort();
        Sort insertion = new InsertionSort();
        Sort shell = new ShellSort();
        Sort merge = new MergeSort();

        final int size = 10_000;
        String ordering;

        //Selection sort
        System.out.println("Selection sort:");
        ordering = "ascending";
        benchmarkTest(selection, size, ordering);
        ordering = "descending";
        benchmarkTest(selection, size, ordering);

        //Insertion sort
        System.out.println("\nInsertion sort:");
        ordering = "ascending";
        benchmarkTest(insertion, size, ordering);
        ordering = "descending";
        benchmarkTest(insertion, size, ordering);

        //Shell sort
        System.out.println("\nShell sort:");
        ordering = "ascending";
        benchmarkTest(shell, size, ordering);
        ordering = "descending";
        benchmarkTest(shell, size, ordering);
//
//        //Merge sort
//        System.out.println("\nMerge sort:");
//        ordering = "ascending";
//        benchmarkTest(merge, size, ordering);
//        ordering = "descending";
//        benchmarkTest(merge, size, ordering);

//        start = System.nanoTime();
//        selection.sort(generateList(size, max, listOrdering));
//        elapse = System.nanoTime() - start;
//        System.out.printf("Elapse time for selection:\n%,15d ns\n", elapse);


//        //Merge sort
//        start = System.nanoTime();
//        merge.sort(generateList(size,max,listType));
//        elapse = System.nanoTime() - start;
//        System.out.printf("Elapse time for merge:\n%,15d ns\n", elapse);

//        //insertion sort
//        start = System.nanoTime();
//        insertion.sort(generateList(size,max,listOrdering));
//        elapse = System.nanoTime() - start;
//        System.out.printf("Elapse time for insertion:\n%,15d ns\n", elapse);

//        //shell sort
//        start = System.nanoTime();
//        shell.sort(generateList(size,max,listOrdering));
//        elapse = System.nanoTime() - start;
//        System.out.printf("Elapse time for shell:\n%,15d ns\n", elapse);

//        //Arrays sort (builtin)
//        start = System.nanoTime();
//        Arrays.sort(generateList(size,max,listType));
//        elapse = System.nanoTime() - start;
//        System.out.printf("Elapse time for Arrays.sort:\n%,15d ns\n", elapse);

//        //List sort (builtin)
//        start = System.nanoTime();
//        Arrays.asList(generateList(size, max, listType)).sort(Integer::compare);
//        elapse = System.nanoTime() - start;
//        System.out.printf("Elapse time for Collections.sort:\n%,15d ns\n", elapse);
    }
}
