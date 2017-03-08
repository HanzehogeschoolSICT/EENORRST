import java.util.List;

/**
 * Contains a bubble sort implementation
 */
public class BubbleSort extends AbstractSort {

    /**
     * Bubble sort implementation
     * @param list to be sorted
     * @return sorted list in Ascending order
     */
    @Override
    public List<Integer> sortAsc(List<Integer> list){

        int listSize = list.size();

        while(listSize > 1){
            for(int i = 0; i < (listSize-1); i++){

                Integer firstValue = list.get(i);
                Integer secondValue = list.get(i+1);

                // If first is bigger than second, flip the values
                if (firstValue > secondValue){
                    list.set(i+1, firstValue);
                    list.set(i, secondValue);
                }
            }
            listSize--;
        }
        return list;
    }

    @Override
    public void step() {
        return;
    }
}
