package com.quicksort;

public class PartitionArrays {
    public static void main(String[] args) {
        int[] arr = {3,5,6,7,8,4,1,2,3,5,6,7};
        int ans[] = partitionArray(arr,4);
        for(Integer i : ans){
            System.out.print(i+" ");
        }
    }
    public static int[] partitionArray(int[] arr, int p){
        int n = arr.length;
        int p1=0,p2=0;
        while(p2 < n){
            if(arr[p2] == p){
                Sort01.swap(arr,p1,p2);
                p++;
            }
            p2++;
        }
        return arr;
    }
}
