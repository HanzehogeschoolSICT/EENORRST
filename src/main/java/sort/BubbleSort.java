package sort;

import java.util.List;

/**
 * Contains a bubble sort implementation
 */
public class BubbleSort extends AbstractSort {

    private int currentPos;
    private int currentLength;

    /**
     * Creates a new BubbleSort object, Defines list in the abstract superclass
     * @param list that needs to be sorted
     */
    public BubbleSort(List<Integer> list){
        super(list);
        currentLength = list.size();
        currentPos = 0;
    }

    /**
     * Executes one step of the BubbleSort algorithm,
     * @return true if the list is sorted
     */
    public boolean sort() {
        // Check if the list is sorted
        if (currentLength <= 1) {
            return true;
        }

        if (currentPos < (currentLength - 1)) {
            Integer firstValue = list.get(currentPos);
            Integer secondValue = list.get(currentPos + 1);

            // If first is bigger than second, flip the values
            if (firstValue > secondValue) {
                list.set(currentPos + 1, firstValue);
                list.set(currentPos, secondValue);
            }
            currentPos++;
        } else {
            currentPos = 0;
            currentLength--;
            sort(); // skip reset moves
        }
        return false;
    }
    
    /**
     * Loops the sort method till true, then returns the sorted list
     * @return the sorted list
     */
    @Override
    public List<Integer> sortFull() {
        while(!sort()){
        }
        return getList();
    }
}
