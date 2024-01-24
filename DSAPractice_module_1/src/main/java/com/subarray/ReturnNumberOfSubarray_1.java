package com.subarray;

public class ReturnNumberOfSubarray_1 {
    public static void main(String[] args) {
        int []arr = {1,2,3};
        int x = numOfSubArray(arr);
        System.out.println(x);
    }
    public static int numOfSubArray(int[] A){
        int n = A.length;
        int subArrays = (n*(n+1))/2;
        return subArrays;
    }
}
