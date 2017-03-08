package sort;

import java.util.List;

/**
 * Interface of all the methods of the sorting algorithms
 */
public interface SortAlgorithm {

    List<Integer> sortAsc(List<Integer> list);
    void step();
}
