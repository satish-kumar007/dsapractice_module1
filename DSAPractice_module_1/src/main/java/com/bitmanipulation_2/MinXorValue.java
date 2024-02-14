package com.bitmanipulation_2;

import java.util.Arrays;

public class MinXorValue {
    public int findMinXor(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        int ans = Integer.MAX_VALUE;
        for(int i=0;i < n-1;i++){
            ans = Math.min(ans,A[i]^A[i+1]);
        }
        return ans;
    }
}
