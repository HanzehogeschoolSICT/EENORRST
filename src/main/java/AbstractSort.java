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
    public List<Comparable> sortAsc(List<Comparable> list) {
        Collections.sort(list);
        return list;
    }

    /**
     * Sorts the list using the standard library in Descending order
     * @param list to be sorted
     * @return sorted list
     */
    @Override
    public List<Comparable> sortDesc(List<Comparable> list) {
        List<Comparable> sortedList = this.sortAsc(list);
        Collections.reverse(sortedList);
        return sortedList;
    }
}
