package uk.ac.cam.amd96.sort;

import java.util.List;

/**
 * Created by Alex on 17/03/2015.
 */
public class Bubble extends Sorter{
    public Bubble(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public List<Integer> sort() {
        boolean swapped = true;
        int j=0;
        while(swapped){
            swapped=false;

            for(int k=0;k<numbers.size()-(j+1);k++){
                if(numbers.get(k)>numbers.get(k+1)){
                    swap(k,k+1);
                    swapped=true;
                }
            }
            j++;
        }
        return numbers;
    }


}
