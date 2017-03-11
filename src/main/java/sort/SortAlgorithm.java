package sort;

import java.util.List;

/**
 * Interface of all the methods of the sorting algorithms
 */
public interface SortAlgorithm {

    boolean sort();
    List<Integer> getList();
    void step();
}
