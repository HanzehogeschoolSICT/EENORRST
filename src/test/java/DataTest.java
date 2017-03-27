import model.Data;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by georg on 07-Mar-17.
 */
public class DataTest {
    private static Data data;
    private static ArrayList<Integer> sampleArray;

    @BeforeClass
    public static void initData(){
        data = new Data();
        data.generateRandomData(5);
    }

    /**
     * Tests the generation of Datasets that should be empty
     */
    @Test
    public void testGenerateSampleDataEmpty(){
//        try {
//            ArrayList<Integer> EmptyList = new ArrayList<>();
//
//            // n = 0
//            ArrayList<Integer> ZeroN = data.ge(0);
//            assertEquals(EmptyList, ZeroN);
//
//            // n = -1 Should also be empty
//            ArrayList<Integer> NegativeN = data.getGeneratedData(-1);
//            assertEquals(EmptyList, NegativeN);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    /**
     * Tests the generation of Datasets
     */
    @Test
    public void testGenerateSampleData(){
        try {
            //Actual hardcoded data
            sampleArray = new ArrayList<>();
            sampleArray.add(1);
            sampleArray.add(2);
            sampleArray.add(3);
            sampleArray.add(4);
            sampleArray.add(5);

            List<Integer> sample = data.getGeneratedData();
            Collections.sort(sample); //Sorting because generated data is shuffled
            assertEquals(sampleArray, sample);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
