package uk.ac.cam.amd96.sort;

import java.util.List;

/**
 * Created by Alex on 17/03/2015.
 */
public class Heap extends Sorter {
    public Heap(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public List<Integer> sort() {

        for(int k = numbers.size()/2;k>=0;k--){
            heapify(k,numbers.size());
        }
        for(int j = numbers.size();j>1;j--){
            swap(0,j-1);
            heapify(0,j-1);
        }

        return numbers;
    }

    public void heapify(int iRoot,int iEnd){
        int iMax=0;
        if(2*iRoot+1<iEnd&&2*iRoot+2<iEnd) {
            if (numbers.get(2 * iRoot + 1) >= numbers.get(2 * iRoot + 2)) {
                iMax = 2 * iRoot + 1;
            } else {
                iMax = 2 * iRoot + 2;
            }

        }else if(2*iRoot+2<iEnd){
            iMax = 2*iRoot+2;
        }

        if (!(numbers.get(iRoot) >= numbers.get(iMax)) && iMax!=0) {
            swap(iRoot, iMax);
            heapify(iMax, iEnd);
        }
    }
}
