package com.twopointer;

import java.util.HashMap;

public class CountPairForGivenSumNonDistinct_3 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,3,4,5,6,7,7,8,8};
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
            }else if(arr[i] + arr[j] == k) {
                count++;
                int count1 = 0;
                int count2 = 0;
                int current = arr[i];
                while (i < n && arr[i] == current) {
                    count1++;
                    i++;
                }
                int current2 = arr[j];
                while (j >= 0 && arr[j] == current2) {
                    count2++;
                    j--;
                }

                if (current2 == current) {
                    count = count1 * count2;
                }
            }
        }
        //System.out.println(pairs);
        return count;
    }
}
