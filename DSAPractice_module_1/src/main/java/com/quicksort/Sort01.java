package com.quicksort;

public class Sort01 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0};
        int ans[] = sort01(arr);
        for(Integer i : ans){
            System.out.print(i+" ");
        }
    }

    public static int[] sort01(int[] arr){
        int n = arr.length;
        int p1=0;
        int p2=0;
        while(p2 < n){
            if(arr[p2] == 0){
                swap(arr, p1, p2);
                p1++;
            }
            p2++;
        }
        return arr;
    }
    public static void swap(int[] arr, int p1, int p2){
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
