package com.hashing2;

import java.util.HashSet;

public class TargetSubArraySumK {
    public static void main(String[] args) {
        int[] A = {1, 0, 1};
        int B = 1;
        System.out.println(checkForSumK(A,B));
    }
    public static boolean checkForSumK(int[] arr, int k){
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            int x = sum;
            int y = x - k;
            if(set.contains(y)){
                return true;
            }
            set.add(x);
        }
        return false;
    }
}
