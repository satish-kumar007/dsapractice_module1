package com.binarysearch_3;

import java.util.Arrays;

public class AggresiveCows_3 {
    public static int solve(int[] A, int B) {
        int n = A.length;
        Arrays.sort(A);
        int l=1;
        int h = A[n-1] - A[0];
        int ans=0;
        while(l <= h){
            int mid = l+(h-l)/2;
            if(check(A, mid,B)){
                ans = mid;
                l=mid+1;
            }else{
                h = mid-1;
                System.out.println(h+"======================");
            }
            System.out.println(ans +"  ======  "+l+"  ======= "+h+" === "+mid);
        }
        return ans;
    }

    private static boolean check(int[] ar, int distance, int m) {
        int n = ar.length;
        int cows = 1;
        int lastPos = ar[0];
        for(int i=1;i<n;i++){
            //System.out.println((ar[i]-lastPos)+" =====  "+distance);
            if((ar[i]-lastPos) >= distance){
                cows++;
                lastPos = ar[i];
                if(cows == m){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = {4,2,3};
        int B = 2;
        int x = solve(A,B);
        System.out.println(x);
    }
}
