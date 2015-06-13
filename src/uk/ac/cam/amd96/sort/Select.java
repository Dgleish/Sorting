package uk.ac.cam.amd96.sort;

import java.util.List;

/**
 * Created by Alex on 17/03/2015.
 */
public class Select extends Sorter {
    public Select(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public List<Integer> sort() {
        for(int k=0;k<numbers.size();k++){
            int iMin = k;
            for(int j=iMin+1;j<numbers.size();j++){
                if(numbers.get(j)<numbers.get(iMin)){
                    iMin = j;
                }
            }
            swap(k,iMin);





        }

        return numbers;
    }
}
