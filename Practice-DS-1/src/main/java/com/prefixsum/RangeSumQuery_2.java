package com.prefixsum;

public class RangeSumQuery_2 {
    public static void main(String[] args) {

    }
    public int[] solve(int[] A, int[][] B){
        int n = A.length;
        int m = B.length;
        int[] psum = ConstructPrefixSumArray_1.getPrefixSum(A);
        int[] ans = new int[m];

        for(int i=0;i<m;i++){
            int l = B[i][0];
            int r = B[i][1];
            int sum = 0;
            if(l != 0){
                sum = psum[r] - psum[l-1];
            }else{
                sum = psum[r];
            }
            ans[i] = sum;
        }
        return ans;
    }
}
