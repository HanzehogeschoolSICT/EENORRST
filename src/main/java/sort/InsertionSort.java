package sort;

import java.util.List;

/**
 * Created by georg on 11-Mar-17.
 */
public class InsertionSort extends AbstractSort{

    private int position;

    /**
     * Stores list in the list field, sets position to zero
     * @param list list to be sorted
     */
    public InsertionSort(List<Integer> list) {
        super(list);
        position = 0;
    }

    /**
     * Executes one step in the InsertionSort algorithm
     * - Looks if the current position is equal to the length of the list
     * - Gets the element at the current position
     * - Loops trough the elements BEFORE the current position
     * - Inserts element where it is smaller than the next element (before the position) and breaks
     * - Increments the position
     * @return true if list is sorted, false if there are more steps to be executed
     */
    @Override
    public boolean sort() {
        if (position == list.size()) {
            return true;
        }

        int currentElem = list.get(position);

        for (int i = 0; i < position; i++) {
            if (currentElem < list.get(i)){
                list.remove(position);
                list.add(i, currentElem);
                break;
            }
        }
        position++;
        return false;
    }

    /**
     * loops the sort method till the list is sorted
     * @return the sorted list
     */
    @Override
    public List<Integer> sortFull() {
        while(!sort()){
        }
        return super.getList();
    }
}
