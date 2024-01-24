package com.prefixsum;

public class CountEquilibriumIndex_3 {
    public static void main(String[] args) {
        int[] ar = {0,1,1,3,2};
        int x = countEquilibriumIndexes(ar);
        System.out.println(x);
    }

    public static int countEquilibriumIndexes(int[] ar){
        int n = ar.length;
        int []psum = ConstructPrefixSumArray_1.getPrefixSum(ar);
        int count = 0;
        for(int i=0;i<n;i++){
            int start = 0;
            if(i > 0){
                start = psum[i-1];
            }
            int end = psum[n-1] - psum[i];
            if(start == end){
                count++;
            }
        }
        return count;
    }

}
