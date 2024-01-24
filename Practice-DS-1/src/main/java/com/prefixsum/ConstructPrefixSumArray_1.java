package com.prefixsum;

public class ConstructPrefixSumArray_1 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int[] ans = getPrefixSum(arr);
        for(Integer i : ans){
            System.out.print(i+" ");
        }
    }

    public static int[] getPrefixSum(int[] ar){
        int n = ar.length;
        int []ans = new int[n];

        ans[0] = ar[0]; // store the first element as it is in ans array
        for(int i=1;i<n;i++){ // loop will start from 1 index bcz already stored ar[0] in ans[0] index
            ans[i] = ans[i-1] + ar[i];//here we are adding ans array element with current arr element.
        }
        return ans;
    }
}
