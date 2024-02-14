package com.twopointer;

import java.util.HashMap;

public class CountPairForGivenSumDistinct_2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        int k = 10;
        int count = getPairsCount(arr,k);
        System.out.println(count);
    }
    public static int getPairsCount(int[] arr, int k){
        int n = arr.length;
        int i = 0;
        int j=n-1;
        int count=0;
        HashMap<Integer, Integer> pairs = new HashMap<>();
        while(i < j){
            if(arr[i] + arr[j] > k){
                j--;
            }else if(arr[i] + arr[j] < k){
                i++;
            }else if(arr[i] + arr[j] == k){
                count++;
                pairs.put(i,j);
                i++;
                j--;
                pairs.put(i,j);
                //System.out.println();
            }
        }
        System.out.println(pairs);
        return count;
    }
}
