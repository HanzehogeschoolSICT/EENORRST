package sort;

import java.util.List;

/**
 * Factory that can create all the sorting algorithms
 */
public class SortFactory {

    public QuickSort createQuickSort(List<Integer> list){
        return new QuickSort(list);
    }

    public BubbleSort createBubbleSort(List<Integer> list){
        return new BubbleSort(list);
    }

    public InsertionSort createInsertionSort(List<Integer> list){
        return new InsertionSort(list);
    }
}
