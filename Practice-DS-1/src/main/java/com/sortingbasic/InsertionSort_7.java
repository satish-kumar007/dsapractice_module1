package com.sortingbasic;

public class InsertionSort_7 {
    public static void main(String[] args) {
        int[] x = {5,6,4,2};
        int[] ar = sortElement(x);
        for(Integer i : ar){
            System.out.print(i+" ");
        }
    }
    public static int[] sortElement(int[] ar){
        int n = ar.length;
        for(int i=1;i<n;i++){
            int currentElement = ar[i];
            int j= i-1;
            while(j >= 0 && ar[j] > currentElement){
                ar[j+1] = ar[j];
                j--;
            }
            ar[j+1] = currentElement;
        }
        return ar;
    }
}
