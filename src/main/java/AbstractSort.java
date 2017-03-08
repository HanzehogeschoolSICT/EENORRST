import java.util.List;

/**
 * Abstract class for the sorting algorithms
 */
public abstract class AbstractSort implements SortAlgorithm {

    private List<Comparable> list;

    /**
     * Constructor that stores the list
     * @param list The list that needs to be sorted
     */
    AbstractSort(List<Comparable> list){
        this.list = list;
    }
    
}
