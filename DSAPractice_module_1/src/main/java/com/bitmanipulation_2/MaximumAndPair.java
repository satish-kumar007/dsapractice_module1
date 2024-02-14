package com.bitmanipulation_2;

public class MaximumAndPair {
    public int solve(int[] A) {
        int n = A.length;
        int ans = 0;
        for(int i=31;i>=0;i--){
            int count=0;
            for(int j=0;j<n;j++){
                if((A[j] & (1 << i)) > 0){
                    count++;
                }
            }
            if(count >= 2){
                ans = ans | (1 << i);
                for(int j=0;j<n;j++){
                    if((A[j] & (1 << i)) == 0){
                        A[j] = 0;
                    }
                }
            }
        }
        return ans;
    }
}
