package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Data {

    private List<Integer> generatedData = new ArrayList<>();

    /**
     * Creates a ArrayList of  Real Integers between range 1..n (inclusive) in order
     * @param n Last number of the array
     * @return scrambled ArrayList with integers in range 1..n
     */
    private ArrayList<Integer> generateData(int n) {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        while(n > 0){
            newArrayList.add(n);
            n--;
        }
        return newArrayList;
    }

    /**
     * Creates a ArrayList of random Real Integers between range 1..n (inclusive) in a reversed
     * @param n Last number of the array
     * @return scrambled ArrayList with integers in range 1..n
     */
    public void generateReversedData(int n) {
        generatedData = generateData(n);
    }

    /**
     * Creates a ArrayList of random Real Integers between range 1..n (inclusive) in a random order
     * @param n Last number of the array
     * @return scrambled ArrayList with integers in range 1..n
     */
    public void generateRandomData(int n) {
        ArrayList<Integer> newArrayList =  generateData(n);
        Collections.shuffle(newArrayList);
        generatedData = newArrayList;
    }

    public List<Integer> getGeneratedData() {
        return generatedData;
    }
}
