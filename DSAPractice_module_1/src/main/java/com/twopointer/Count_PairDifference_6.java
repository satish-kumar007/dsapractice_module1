package com.twopointer;

import java.util.Arrays;

public class Count_PairDifference_6 {
    public static void main(String[] args) {
        int [] arr = {1, 1, 1, 2, 2};
        int k = 0;
        int c = countPairDifference(arr,k);
        System.out.println(c);
    }
    public static int countPairDifference(int[] A, int B){
        Arrays.sort(A);
        int n = A.length;
        int i=0;
        int j=0;
        int count=0;
        while(j<n){
            if(A[j] - A[i] == B){
                count++;
                j++;
                i++;
                System.out.println(i+" , "+j);
            } else if(A[j] - A[i] < B){
                j++;
            }else{
                i++;
            }
        }
        return count;
    }
}
