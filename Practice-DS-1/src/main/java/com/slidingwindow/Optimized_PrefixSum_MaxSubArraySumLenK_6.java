package com.slidingwindow;

import com.prefixsum.ConstructPrefixSumArray_1;

public class Optimized_PrefixSum_MaxSubArraySumLenK_6 {
    public static void main(String[] args) {
        int[] arr = {-3,4,-2,5,3,-2,8,2,-1,4};
        prefixSumMaxSubArraySum(arr,5);
    }
    public static int prefixSumMaxSubArraySum(int[] arr, int k){
        int n = arr.length;
        int s=0;
        int e = k-1;
        int maxSum = 0;
        int []psum = ConstructPrefixSumArray_1.getPrefixSum(arr);
        while(e<n){
            int sum=0;
            if(s==0){
                sum = psum[e];
            }else{
                sum = psum[e]-psum[s-1];
            }
            maxSum = Math.max(maxSum,sum);
            s++; e++;
        }
        System.out.println(maxSum);
        return maxSum;
    }
}
