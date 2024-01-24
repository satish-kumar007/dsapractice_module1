package com.slidingwindow;

public class MinimumNoOfSwap_8 {

    public static void main(String[] args) {
        int[] x = {5, 17, 100, 11};
        int y = 20;
        System.out.println(solve(x,y));
    }
    public static int solve(int[] A, int B) {
        int n = A.length;
        int k=0;
        for(int i=0;i<n;i++) {
            if (A[i] <= B) {
                k++;
            }
        }
        if(k==0 || k==1 || k==n){return 0;}
        int bad = 0;
        for(int i=0;i<k;i++) {
            if (A[i] > B) {
                bad++;
            }
        }
        int ans = bad;
        int s=1, e=k;
        while(e<n){
            if (A[s-1] > B) {
                bad--;
            }
            if (A[e] > B) {
                bad++;
            }
            ans = Math.min(ans, bad);
            s++;e++;
        }
        return ans;
    }
}

