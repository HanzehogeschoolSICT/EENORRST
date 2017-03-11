package sort;

import model.Data;

import java.util.*;

/**
 * Created by georg on 11-Mar-17.
 */
public class QuickSort {

    private Random rand = new Random();
    private List list;


    public List<Integer> sort(List<Integer> list) {

        if (list.size() <= 1) {
            return list;
        }

        int pivotPos = rand.nextInt(list.size());
        int pivot = list.get(pivotPos);
        int currentPos = 0;
        List<Integer> smallList = new LinkedList<>();
        List<Integer> bigList = new LinkedList<>();
        List<Integer> newList = new LinkedList<>();

        while(currentPos < list.size()) {
            int currentElem = list.get(currentPos);
            if (currentPos == pivotPos) {
                currentPos++;
                continue;
            }
            if (currentElem < pivot) {
                smallList.add(currentElem);
            }
            else {
                bigList.add(currentElem);
            }
            currentPos++;
        }

        newList.add(pivot);
        newList.addAll(sort(bigList));
        newList.addAll(0, sort(smallList));
        return newList;
    }

    QuickSort() {
    }

    public static void main(String [] args){
        List<Integer> list = new Data().generateSampleData(100);

        System.out.println(new QuickSort().sort(list));
    }
}
