package model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by georg on 07-Mar-17.
 */
public class Data {

    /**
     * Creates a ArrayList of random Real Integers between range 1..n (inclusive) in a random order
     * @param n Last number of the array
     * @return scrambled ArrayList with integers in range 1..n
     */
    public ArrayList<Integer> generateSampleData(int n) {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        while(n > 0){
            newArrayList.add(n);
            n--;
        }
        Collections.shuffle(newArrayList);
        return newArrayList;
    }
}
