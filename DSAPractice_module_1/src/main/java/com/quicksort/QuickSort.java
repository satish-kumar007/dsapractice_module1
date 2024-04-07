package com.quicksort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4,5,6,3,7,2,8,1,9,6,4,73,8,2,9};
        quickSort(arr,0,15);
    }
    public static void quickSort(int[] arr, int s, int e){
        if(s<e)
            return;
        int part = partitionArr(arr,s,e);
        quickSort(arr,s, part-1);
        quickSort(arr,part+1, e);
        for(Integer i : arr){
            System.out.print(i+" ");
        }
    }
    public static int partitionArr(int [] arr, int low, int high){
        int n = arr.length;
        int p1=0,p2=low;
        int pivot = arr[high];
        while(p2<n){
            if(arr[p2] < pivot){
                Sort01.swap(arr,p1,p2);
                p1++;
            }
            p2++;
            Sort01.swap(arr,p1,high);
        }
        return p1;
    }
}
