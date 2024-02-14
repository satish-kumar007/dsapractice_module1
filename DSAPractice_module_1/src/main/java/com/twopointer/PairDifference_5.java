package com.twopointer;

public class PairDifference_5 {
    public static void main(String[] args) {
        int [] arr = {-5,-2,1,8,10,12,15};
        int k = 11;
        pairDifference(arr,k);
    }
    public static void pairDifference(int[] arr, int k){
        int n = arr.length;
        int i=0;
        int j=0;
        while(j<n){
            if(arr[j] - arr[i] == k){
                System.out.println(i+" , "+j);
            }
            if(arr[j] - arr[i] < k){
                j++;
            }else{
                i++;
            }
        }
    }
}
