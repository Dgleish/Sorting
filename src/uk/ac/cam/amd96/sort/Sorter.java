package uk.ac.cam.amd96.sort;

import java.util.List;

/**
 * Created by Alex on 17/03/2015.
 */
public abstract class Sorter {
    List<Integer> numbers;
    public abstract List<Integer> sort();

    public void swap(int k, int l){
        int n = numbers.get(k);
        numbers.set(k,numbers.get(l));
        numbers.set(l,n);
    }
}
