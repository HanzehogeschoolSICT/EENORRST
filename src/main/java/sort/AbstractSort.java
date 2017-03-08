package sort;

import java.util.Collections;
import java.util.List;

/**
 * Abstract class for the sorting algorithms
 */
public abstract class AbstractSort implements SortAlgorithm {

    /**
     * Sorts the list using the standard library in Ascending order
     * @param list to be sorted
     * @return sorted list
     */
    @Override
    public List<Integer> sortAsc(List<Integer> list) {
        Collections.sort(list);
        return list;
    }
}
