package uk.ac.cam.amd96.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Alex on 17/03/2015.
 */
public class main {
    public static void main(String[] args) {
        List<Integer> sortme = new ArrayList<Integer>(Arrays.asList(1,8,5,6,3,3,7,4,13,7,5,33,4,2,2,6,1,7,8,3,6,56,476,62,6,13,4));
        long iterations=1000l;
        long start=0l;
        long finish=0l;
        long total=0l;
        for(int i=0;i<iterations;i++) {
           start= System.nanoTime();
            Sorter sorter = new Heap(sortme);
            finish = System.nanoTime();
            total += (finish-start);
        }
        System.out.println("Heap " + total/iterations);

        for(int i=0;i<iterations;i++) {
            start= System.nanoTime();
            Sorter sorter = new Select(sortme);
            finish = System.nanoTime();
            total += (finish-start);
        }
        System.out.println("Select " + total/iterations);

    }
}
