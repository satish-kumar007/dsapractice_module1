package com.countsort;

public class MergeSortedSubArray {
    public static void main(String[] args) {
        int[] arr = {-5,-2,2,4,6,8,9,-1,0,1,2,3,4,5,6,};
        int s=2;
        int e=12;
        int m=6;
        int ans[] = mergeSortedSubArray(arr,s,m,e);
        for(Integer i : ans){
            System.out.print(i+" ");
        }
    }
    public static int[] mergeSortedSubArray(int[] arr, int s, int m, int e){
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
        return ans;
    }
}
