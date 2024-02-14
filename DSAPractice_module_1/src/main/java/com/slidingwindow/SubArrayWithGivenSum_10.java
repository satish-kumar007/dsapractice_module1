package com.slidingwindow;

public class SubArrayWithGivenSum_10 {
    public static void main(String[] args) {
        int[] A = {4, 2, 2, 5, 1};
        int B = 4;
        int C = 6;
        int x = solve(A,B,C);
        System.out.println(x);
    }
    public static int solve(int[] A, int B, int C) {
        int n=A.length;
        int sum=0;
        for(int i=0;i<B;i++){
            sum = sum+A[i];
        }
        int s=1;
        int e=B;
        while(e < n){
            sum = sum-A[s-1]+A[e];
            if(sum == C){
                return 1;
            }
            //System.out.println(sum);
            e++;
            s++;
        }

        return 0;
    }
}
