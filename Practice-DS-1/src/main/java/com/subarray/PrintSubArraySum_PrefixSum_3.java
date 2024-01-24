package com.subarray;

import com.prefixsum.ConstructPrefixSumArray_1;

public class PrintSubArraySum_PrefixSum_3 {
    public static void main(String[] args) {
        int[] arr = {2,8,-1,4};
        printSubArraySum(arr);
    }
    public static void printSubArraySum(int[] arr){
        int n = arr.length;
        int[] psum = ConstructPrefixSumArray_1.getPrefixSum(arr);
        for(int s=0;s<n;s++){
            int sum=0;
            for(int e=s;e<n;e++){
                if(s != 0){
                    sum = psum[e] - psum[s-1];
                }else{
                    sum = psum[e];
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
