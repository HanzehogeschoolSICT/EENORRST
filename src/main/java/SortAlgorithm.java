import java.util.List;

/**
 * Interface of all the methods of the sorting algorithms
 */
public interface SortAlgorithm {

    <E extends Comparable<E>> List<E> sortAsc(List<E> list);
    void step();
}
