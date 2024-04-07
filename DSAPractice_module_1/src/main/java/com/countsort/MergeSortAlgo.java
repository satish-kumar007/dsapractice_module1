package com.countsort;

public class MergeSortAlgo {
    public static void main(String[] args) {
        int[] arr = {9,8,1,3,4,1,2};
        int n = arr.length;
        mergeSort(arr,0,n-1);
        for(Integer i : arr){
            System.out.print(i+" ");
        }
    }
    public static void mergeSort(int[] arr, int s, int e){
        int[] ans = null;
        if(s<e) {// based condition to stop
            int mid = (s+e)/2;
            mergeSort(arr, s, mid);//first divide will be from start to mid
            mergeSort(arr, mid+1, e);//second divide will be from mid+1 to end
            mergeSortedSubArray(arr, s, mid, e);
        }

    }

    public static void mergeSortedSubArray(int[] arr, int s, int m, int e){
        int[] ans = new int[e-s+1];
        int p1=s; int p2 = m+1; int k=0;
        while(p1<=m && p2<=e){
            if(arr[p1] < arr[p2]){
                ans[k] = arr[p1];
                p1++;
                k++;
            }else{
                ans[k] = arr[p2];
                p2++;
                k++;
            }
        }
        while(p1<=m){
            ans[k] = arr[p1];
            p1++;
            k++;
        }
        while(p2<=e){
            ans[k] = arr[p2];
            p2++;
            k++;
        }

        for(int i=s;i<=e;i++){
            arr[i] = ans[i-s];
        }
    }
}
