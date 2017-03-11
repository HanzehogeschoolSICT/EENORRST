import model.Data;
import org.junit.BeforeClass;
import org.junit.Test;
import sort.BubbleSort;
import sort.SortAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by georg on 3/8/17.
 */
public class SortTest {

    // Size to test the algorithm against
    private static final int sampleSize = 1000;

    /**
     * Tests the BubbleSort algoritm,
     * - Compares output of BubbleSort with the standard library sort.
     */
    @Test
    public void testBubbleSort(){
        List<Integer> testData = new Data().generateSampleData(sampleSize);
        SortAlgorithm sortAlgorithm = new BubbleSort(testData);

        try {
            List<Integer> sortedlist = sortAlgorithm.sortFull();
            List<Integer> copy = new ArrayList<>(testData);
            Collections.sort(copy);
            assertEquals(copy, sortedlist);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
