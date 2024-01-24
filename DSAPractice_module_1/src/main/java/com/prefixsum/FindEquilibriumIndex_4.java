package com.prefixsum;

public class FindEquilibriumIndex_4 {
    public static int prefIndex(int[] ar){
        int n = ar.length;
        int[] psum = ConstructPrefixSumArray_1.getPrefixSum(ar);
        int index = 0;
        for(int i=0;i<n;i++){
            int start = 0;
            int end = 0;
            if(i > 0){
                start = psum[i-1];
            }
            end = psum[n-1] - psum[i];
            if(start == end){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        int x = prefIndex(A);
        System.out.println(x);
    }
}
