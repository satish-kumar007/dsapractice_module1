package com.subarray;
/*
Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
Your task is to find the count of good subarrays in A.
 */
public class CountOfGoodSubArray_8 {
    public static void main(String[] args) {
        int[] A = {13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9};
        int B = 65;
        int x = countGoodSubArray(A,B);
        System.out.println(x);
    }
    public static int countGoodSubArray(int[] arr, int B){
        int n = arr.length;
        int count = 0;
        int[] psum = goodArrayPrefixSum(arr);

        for(int s=0;s<n;s++){
            for(int e=s;e<n;e++){
                int countGood = 0;//this must declare here only
                int sum=0;
                countGood = e-s+1;//Very important line.
                if(s==0){
                    sum = psum[e];
                }else{
                    sum = psum[e]-psum[s-1];
                }
                if(countGood%2==0 && sum < B)count++;
                if(countGood%2==1 && sum > B)count++;
            }
        }
        return count;
    }
    public static int[] goodArrayPrefixSum(int []A){
        int n=A.length;
        int ans[] = new int[n];
        ans[0] = A[0];
        for(int i=1;i<n;i++){
            ans[i] = ans[i-1] + A[i];
        }
        return ans;
    }
}
