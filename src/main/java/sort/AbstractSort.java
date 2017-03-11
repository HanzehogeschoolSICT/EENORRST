package sort;

import java.util.Collections;
import java.util.List;

/**
 * Abstract class for the sorting algorithms
 */
public abstract class AbstractSort implements SortAlgorithm {

    // holds the current list.
    List<Integer> list;

    /**
     * Places list in field, so every subclass works with a state.
     * @param list to store.
     */
    AbstractSort(List<Integer> list){
        this.list = list;
    }

    /**
     * Sorts the list using the standard library
     * @return the sorted list
     */
    @Override
    public List<Integer> sortFull() {
        Collections.sort(list);
        return list;
    }

    /**
     * @return the list in the current state
     */
    @Override
    public List<Integer> getList(){
        return list;
    }
}
