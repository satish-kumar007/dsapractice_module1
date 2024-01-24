package com.prefixsum;

public class SumOfEvenIndices_7 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[][] B = {{0,2},{1,4}};
        int[] ans = evenIndicesPrefixSum(A);
        for(Integer i : ans){
            System.out.print(i+" ");
        }
        System.out.println();
        int[] finalAns = solve(A,B);
        for(Integer i : finalAns){
            System.out.print(i+" ");
        }
    }
    public static int[] solve(int[] A, int[][] B) {
        int m = B.length;
        int evensum[] = evenIndicesPrefixSum(A);
        int ans[] = new int[m];
        for(int i=0;i<m;i++){
            int s = B[i][0];
            int e = B[i][1];
            if(s > 0){
                ans[i] = evensum[e] - evensum[s-1];
            }else{
                ans[i] = evensum[e];
            }
        }
        return ans;
    }

    public static int[] evenIndicesPrefixSum(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = arr[0];
        for(int i=1;i<n;i++){
            if(i%2 == 0){
                ans[i] = ans[i-1] + arr[i];
            }else{
                ans[i] = ans[i-1];
            }

        }
        return ans;
    }
}
