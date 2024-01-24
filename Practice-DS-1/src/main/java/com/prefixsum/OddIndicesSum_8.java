package com.prefixsum;

public class OddIndicesSum_8 {
    public static int[] oddIndicesPrefixSum(int[] arr){
        int n = arr.length;
        int []ans = new int[n];
        ans[0] = arr[0];
        for(int i=1;i<n;i++){
            if(i%2==1){
                ans[i] = ans[i-1]+arr[i];
            }else{
                ans[i] = ans[i-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{0,2},{1,4}};
        int[] ans = oddIndicesPrefixSum(A);
        for(Integer i : ans){
            System.out.print(i+" ");
        }
    }
}
