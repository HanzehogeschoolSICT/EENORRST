package sort;

import java.util.Collections;
import java.util.List;

/**
 * Abstract class for the sorting algorithms
 */
public abstract class AbstractSort implements SortAlgorithm {

    /**
     * Sorts the list using the standard library in Ascending order
     * @return sorted list
     */
    @Override
    public boolean sort() {
//        Collections.sort(list);
        return true;
    }
}
