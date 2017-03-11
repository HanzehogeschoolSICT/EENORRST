package sort;

import java.util.List;

/**
 * Created by georg on 11-Mar-17.
 */
public class InsertionSort extends AbstractSort{

    int position;

    public InsertionSort(List<Integer> list) {
        super(list);
        position = 0;
    }

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

    @Override
    public List<Integer> getList() {
        return list;
    }

    @Override
    public List<Integer> sortFull() {
        return super.sortFull();
    }
}
