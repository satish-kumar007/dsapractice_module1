package com.slidingwindow;

public class Optimized_SlidingWindow_MaxSubArraySumLenK_7 {
    public static void main(String[] args) {
        int[] arr = {-3,4,-2,5,3,-2,8,2,-1,4};
        maxSubArraySum(arr,5);
    }
    public static int maxSubArraySum(int[] arr, int k){
        int n = arr.length;
        int sum=0;
        int maxSum = 0;
        for(int i=0;i<k;i++){
            sum = sum+arr[i];
        }
        int s=1;
        int e=k;
        while(e < n){
            sum = sum - arr[s-1] + arr[e];
            maxSum = Math.max(maxSum,sum);
            //System.out.println(sum);
            s++;e++;
        }
        System.out.println(maxSum);
        return maxSum;
    }

}
