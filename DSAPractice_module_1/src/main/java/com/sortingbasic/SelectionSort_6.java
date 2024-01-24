package com.sortingbasic;

public class SelectionSort_6 {
    public static void main(String[] args) {
        int[] x = {5,6,4,2};
        int[] ar = getSortedArray(x);
        for(Integer i : ar){
            System.out.print(i+" ");
        }
    }
    public static int[] getSortedArray(int[] arr){
        int n=arr.length;
        int minIndex=0;
        for(int i=0;i<n;i++){
            minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }
}
