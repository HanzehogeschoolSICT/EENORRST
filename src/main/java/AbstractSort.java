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
    public <E extends Comparable<E>> List<E> sortAsc(List<E> list) {
        Collections.sort(list);
        return list;
    }
}
