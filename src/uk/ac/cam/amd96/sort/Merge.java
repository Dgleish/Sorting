package uk.ac.cam.amd96.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Alex on 17/03/2015.
 */
public class Merge extends Sorter {
    public Merge(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public List<Integer> sort() {
        int[] numbersarray = new int[numbers.size()];
        for(int i=0;i<numbers.size();i++){
            numbersarray[i] = numbers.get(i);
        }
        numbersarray = mergesort(numbersarray);
        for(int i=0;i<numbers.size();i++){
            numbers.set(i,numbersarray[i]);
        }
        return numbers;
    }

    public int[] mergesort(int[] nums){
        if(nums.length<2){
            return nums;
        }

        int h = nums.length/2;
       int[] a1 = mergesort(Arrays.copyOfRange(nums,0,h));
        int[] a2 = mergesort(Arrays.copyOfRange(nums,h,nums.length));
        int[] a3 = new int[nums.length];
        int i1=0;
        int i2=0;
        int i3=0;
        while (i1<a1.length||i2<a2.length){
            int n =0;
            if(i1>=a1.length){
                n = a2[i2];
                i2++;
            }else if(i2>=a2.length){
                n = a1[i1];
                i1++;
            }else {
                if (a1[i1] < a2[i2]) {
                    n = a1[i1];
                    i1++;
                } else {
                    n = a2[i2];
                    i2++;
                }
            }
           a3[i3] = n;
            i3++;
        }
        return a3;

    }



}
