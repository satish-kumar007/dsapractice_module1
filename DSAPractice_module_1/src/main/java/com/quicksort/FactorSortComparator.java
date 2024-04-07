package com.quicksort;

import java.util.Arrays;
import java.util.Comparator;

public class FactorSortComparator {
    public static void main(String[] args) {
        Integer[] arr = {9,3,10,6,4};
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int fac1 = factor(o1);
                int fac2 = factor(o2);
                if (fac1 < fac2) return -1;
                else if (fac1 > fac2) return 1;
                else {
                    if (o1 < o2) return -1;
                    else if (o1 > o2) return 1;
                    else return 0;
                }
            }
        };
        Arrays.sort(arr, comparator);
        for(Integer i : arr){
            System.out.print(i+" ");
        }
    }
    public static int factor(int n){
        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                if(i == n/i){
                    count++;
                }else{
                    count+=2;
                }
            }
        }
        return count;
    }


}
