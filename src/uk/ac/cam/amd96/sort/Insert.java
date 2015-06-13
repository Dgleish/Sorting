package uk.ac.cam.amd96.sort;

import java.util.List;

/**
 * Created by Alex on 17/03/2015.
 */
public class Insert extends Sorter {


    public Insert(List<Integer> numbers) {
        this.numbers = numbers;
    }



    @Override
    public List<Integer> sort() {
        for(int i=1;i<numbers.size();i++){
            int j=i-1;

            while (j>=0 && numbers.get(j)>numbers.get(j+1)){
                swap(j,j+1);
                j--;
            }
        }


        return numbers;
    }
}
