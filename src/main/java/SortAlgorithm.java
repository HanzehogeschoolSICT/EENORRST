import java.util.List;

/**
 * Interface of all the methods of the sorting algorithms
 */
public interface SortAlgorithm {

    List<Comparable> sortAsc(List<Comparable> list);
    List<Comparable> sortDesc(List<Comparable> list);
    void step();
}
