package com.hashing2;

import java.util.HashMap;
import java.util.HashSet;

//Given array N, count the pairs sum = k, arr[i] +arr[j] ==k && i != j
public class CountPairSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2};
        int k = 3;
        System.out.println(countPairSumK(arr,k));
    }
    public static int countPairSumK(int []arr, int k){
        int n = arr.length;
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int x = arr[i];
            int y = k-x;
            if(map.containsKey(y)){
                count = count + map.get(y);
            }
            map.put(x, map.getOrDefault(x,0)+1);
        }
        return count;
    }
}
