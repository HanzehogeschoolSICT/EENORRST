package model;

import java.util.ArrayList;
import java.util.Collections;

public class Data {

    /**
     * Creates a ArrayList of  Real Integers between range 1..n (inclusive) in order
     * @param n Last number of the array
     * @return scrambled ArrayList with integers in range 1..n
     */
    public ArrayList<Integer> generateData(int n) {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        while(n > 0){
            newArrayList.add(n);
            n--;
        }
        Collections.reverse(newArrayList);
        return newArrayList;
    }

    /**
     * Creates a ArrayList of random Real Integers between range 1..n (inclusive) in a reversed
     * @param n Last number of the array
     * @return scrambled ArrayList with integers in range 1..n
     */
    public ArrayList<Integer> generateReversedData(int n) {
        ArrayList<Integer> newArrayList =  generateData(n);

        Collections.reverse(newArrayList);
        return newArrayList;
    }

    /**
     * Creates a ArrayList of random Real Integers between range 1..n (inclusive) in a random order
     * @param n Last number of the array
     * @return scrambled ArrayList with integers in range 1..n
     */
    public ArrayList<Integer> generateRandomData(int n) {
        ArrayList<Integer> newArrayList =  generateData(n);
        Collections.shuffle(newArrayList);
        return newArrayList;
    }
}
