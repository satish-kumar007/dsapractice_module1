package com.hashing2;

import java.util.HashSet;

//Check given array for pair sum equal to K such that i != j;
public class CheckArrayForpairSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,2,3,1};
        int k = 60;
        System.out.println(checkForK(arr,k));
    }
    public static boolean checkForK(int[] arr, int k){
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            int x = arr[i];
            int y = k-x;
            if(set.contains(y)){
                return true;
            }
            set.add(x);
        }
        return false;
    }
}
