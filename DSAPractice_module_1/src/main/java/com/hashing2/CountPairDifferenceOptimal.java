package com.hashing2;

import java.util.HashMap;

/*
You are given an array A of N integers and an integer B.
Count the number of pairs (i,j) such that A[i] - A[j] = B and i ≠ j.

Since the answer can be very large, return the remainder after dividing the count with 109+7.
 */
public class CountPairDifferenceOptimal {
    public static void main(String[] args) {
        int[] A = {1, 2, 1, 2};
        int B = 1;
        int x = countPairDifference(A,B);
        System.out.println(x);
    }

    public static int countPairDifference(int[] arr, int k){
        int n = arr.length;
        long count=0;
        int MOD = (int)(1e9+7);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            count = count + map.getOrDefault(arr[i] - k,0) + map.getOrDefault(arr[i]+k,0);
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        return (int)(count % MOD);
    }
}
