package sort;

import model.Data;

import java.util.*;

/**
 * Created by georg on 11-Mar-17.
 */
public class QuickSort extends AbstractSort{

    private Stack<Integer> stack = new Stack();
    private List<Integer> list;

    QuickSort(List<Integer> list) {
        super(list);
        int start = 0;
        int end = list.size();

        // Add first sort to the stack
        stack.add(end);
        stack.add(start);
    }

    public boolean sort() {
        if (stack.isEmpty()){
            return true;
        }

        int start = stack.pop();
        int end = stack.pop();

        int sorted = partition(start, end, start);

        if (start < (sorted-1)) {
            stack.add(sorted);
            stack.add(start);
        }
        if ((sorted+2) < end) {
            stack.add(end);
            stack.add(sorted+1);
        }
        return false;
    }

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

    private void swap(int pos1, int pos2){
        int tempValue = list.get(pos1);
        list.set(pos1, list.get(pos2));
        list.set(pos2, tempValue);
    }
}
