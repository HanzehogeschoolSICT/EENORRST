import model.Data;
import org.junit.BeforeClass;
import org.junit.Test;
import sort.BubbleSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by georg on 3/8/17.
 */
public class SortTest {
    private static BubbleSort bubbleSort;
    private static List<Integer> testData;

    @BeforeClass
    public static void init(){
        bubbleSort = new BubbleSort();
        testData = new Data().generateSampleData(10);
    }

    @Test
    public void testBubbleSort(){
        try {
            List<Integer> sortedlist = bubbleSort.sortAsc(testData);
            List<Integer> copy = new ArrayList<>(testData);
            Collections.sort(copy);
            assertEquals(copy, sortedlist);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
