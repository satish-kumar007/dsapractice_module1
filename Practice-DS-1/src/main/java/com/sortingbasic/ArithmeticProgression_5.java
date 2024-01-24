package com.sortingbasic;

import java.util.Arrays;

/*
Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression, otherwise return 0.

A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
 */
public class ArithmeticProgression_5 {
    public static void main(String[] args) {
        int[]  A = {3, 5, 1};
        int x = checkForAP(A);
        System.out.println(x);
    }
    public static int checkForAP(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        int ans=1;
        int diff = arr[1] - arr[0];
        for(int i=2;i<n;i++){
            if(arr[i] - arr[i-1] != diff){
                ans= 0;
                break;
            }
        }
        return ans;
    }
}
