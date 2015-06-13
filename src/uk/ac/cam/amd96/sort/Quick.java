package uk.ac.cam.amd96.sort;

import java.util.List;

/**
 * Created by Alex on 17/03/2015.
 */
public class Quick extends Sorter {
    public Quick(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public List<Integer> sort() {
        quicksort(0,numbers.size());
        return numbers;
    }

    public void quicksort(int iBegin, int iEnd){
        if(iBegin<iEnd) {
            int q = partition(iBegin, iEnd);
            quicksort(iBegin, q);
            quicksort(q + 1, iEnd);
        }
    }

    public int partition(int iBegin, int iEnd){
        //select pivot
        Integer pivot = iEnd-1;
        int iLeft = iBegin;
        int iRight = iEnd -1;

        while (iLeft<iRight){
            if(numbers.get(iLeft)<=numbers.get(pivot)){
                iLeft++;
            }else if (numbers.get(iRight)>numbers.get(pivot)){
                iRight--;
            }else {
                swap(iLeft,iRight);
            }
        }
        if(iLeft!=iRight){
            System.out.println("UH OH UH OH " + iLeft + ", " + iRight);
        }
        swap(pivot,iLeft);
        return iLeft;
    }





}
