package sort;

import java.util.List;

/**
 * Interface of all the methods of the sorting algorithms
 */
public interface SortAlgorithm {

    /**
     * Executes one step in the sorting algorithm, different for each algorithm
     * @return false if there are more steps to be executed, true if the list is sorted.
     */
    boolean sort();

    /**
     * @return Returns the list in the current state, sorted or not sorted.
     */
    List<Integer> getList();

    /**
     * Sorts list in ascending order, with the implemented algorithm in the sort method.
     * @return sorted list in ascending order.
     */
    List<Integer> sortFull();
}
