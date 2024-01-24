package com.prefixsum;

public class ConstructPrefixCountArray_5 {
    public static void main(String[] args) {
        int[] A = {3,4,6,7,1,0,2,12,10};
        int[] ans = pCountAr(A);
        for(Integer i : ans){
            System.out.print(i+" ");
        }
    }
    public static int[] pCountAr(int[] ar){
        int n = ar.length;
        int ans[] = new int[n];
        if(ar[0] % 2 == 0){
            ans[0] = 1;
        }
        for(int i=1;i<n;i++){
            if(ar[i] % 2 == 0){
                ans[i] = ans[i-1] + 1;
            }else{
                ans[i] = ans[i-1];
            }
        }
        return ans;
    }
}
