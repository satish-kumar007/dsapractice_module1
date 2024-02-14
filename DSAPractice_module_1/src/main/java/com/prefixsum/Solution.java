package com.prefixsum;

public class Solution {
    public static void main(String[] args) {
        int[] A={1,4,5,2};
        int [][]B = {{2,3},{3,4},{1,4}};
        int[] x = solve(A,B);
        for(Integer i : x){
            System.out.print(i+" ");
        }

    }
    public static int[] solve(int[] A, int[][] B) {
        int n = B.length;
        int[] psum = prefixPrimeCount(A);
        int ans[] = new int[n];

        for(int i=0;i<B.length;i++){
            int L = B[i][0]-1;
            int R = B[i][1]-1;
            int sum=0;

            if(L != 0){

                ans[i] = psum[R] - psum[L-1];
            }else{
                ans[i] = psum[R];
            }

        }
        return ans;
    }

    public static int[] prefixPrimeCount(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        if(isPrime(arr[0])){
            ans[0] = 1;
        }
        for(int i=1;i<n;i++){
            if(isPrime(arr[i])){
                ans[i] = ans[i-1]+1;
            }else{
                ans[i] = ans[i-1];
            }
        }

        return ans;
    }

    public static int countFactor(int N){
        int count=0;
        for(int i=1;i*i<=N;i++){
            if(N % i ==0){
                if(i == N/i){
                    count=count+1;
                }else{
                    count=count+2;
                }
            }
        }
        return count;
    }

    public static boolean isPrime(int N){
        int x = countFactor(N);
        if(x == 2){
            return true;
        }
        return false;
    }
}