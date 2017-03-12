package sort;

import java.util.*;

/**
 * Iterative variant of the QuickSort algorithm
 */
public class QuickSort extends AbstractSort{

    private Stack<Integer> stack = new Stack<>();

    /**
     * Constructor, calculates the initial start and end positions and adds them to a stack.
     * @param list to be sorted
     */
    public QuickSort(List<Integer> list) {
        super(list);
        int start = 0;
        int end = list.size();

        // Add first sort to the stack
        stack.add(end);
        stack.add(start);
    }

    /**
     * Executes one step in the QuickSort algorithm
     * @return true if the list is sorted, false if there are more steps to be executed.
     */
    public boolean sort() {
        if (stack.isEmpty()){
            return true;
        }
        int start = stack.pop();
        int end = stack.pop();

        int sortedPoint = partition(start, end, start); // Picks the first element as pivot TODO: random pivot
        addToStack(start, end, sortedPoint);

        return false;
    }

    /**
     * Adds sub positions to the stack
     * @param start start point
     * @param end end point
     * @param sortedPoint pivot that is sorted
     */
    private void addToStack(int start, int end, int sortedPoint) {
        if ((sortedPoint+2) < end) {
            stack.add(end);
            stack.add(sortedPoint+1);
        }
        if (start < (sortedPoint-1)) {
            stack.add(sortedPoint);
            stack.add(start);
        }
    }

    /**
     * Partitions the array according to Hoares partitioning scheme,
     * Places everything smaller than the pivot on the left of the pivot
     * Everything equal or bigger than the pivot gets placed on the right.
     * With knowledge/help from:
     * http://me.dt.in.th/page/Quicksort/
     * @param si start position
     * @param ei end position
     * @param pivot the chosen pivot
     * @return position of sorted pivot
     */
    private int partition(int si, int ei, int pivot) {
        swap(pivot, si);
        pivot = si;
        int pos = pivot+1;
        while (si < ei){
            if (list.get(si) < list.get(pivot)){
                swap(si, pos);
                pos++;
            }
            si++;
        }
        swap(pivot, (pos - 1));
        return (pos-1);
    }


    /**
     * Swaps two values in the list
     * @param pos1 position 1 to swap
     * @param pos2 position 2 to swap
     */
    private void swap(int pos1, int pos2){
        int tempValue = list.get(pos1);
        list.set(pos1, list.get(pos2));
        list.set(pos2, tempValue);
    }
}
