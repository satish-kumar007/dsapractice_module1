package com.oneDArray;

public class ZeroQueries_1{
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0};
        int[][] q={{1,3},{4,2},{3,1}};
        int[] x = zeroQueries(arr,q);
        for(Integer i: x){
            System.out.print(i+" ");
        }
    }
    public static int[] zeroQueries(int[] arr, int Q[][]){
        int n = Q.length;
        for(int i=0;i<n;i++){
            int L = Q[i][0];
            arr[L] = Q[i][1];
        }
        int []psum = prefixSum(arr);
        return psum;
    }
    public static int[] prefixSum(int[] arr){
        int n = arr.length;
        int []ans = new int[n];
        ans[0] = arr[0];
        for(int i=1;i<n;i++){
            ans[i] = ans[i-1]+arr[i];
        }
        return ans;
    }
}
