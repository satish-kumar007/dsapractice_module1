package com.hashing2;

import java.util.HashMap;

/*
Given an array of integers A and an integer B.
Find the total number of subarrays having sum equals to B.
 */
public class TargetSubArraySumK_1 {
    public static void main(String[] args) {
        int[] A = {1, 0, 1};
        int B = 1;
        System.out.println(countSubArrayForKSum(A,B));
    }

    public static int countSubArrayForKSum(int[] arr, int k){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        int sum=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            int x = sum;
            int y = x-k;
            if (map.containsKey(y)) {
                count = count + map.get(y);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }

    public int solve(int[] A, int B) {
        int n = A.length;
        long count=0;
        HashMap<Long,Long> map = new HashMap<>();
        for(int i=0;i<n;i++){
            long x = A[i];
            long y = B - x;
            if(map.containsKey(y)){
                count+=map.get(y);
            }
            map.put(x, (long)map.getOrDefault(x,0L)+1);
        }
        return (int)count;
    }
}
