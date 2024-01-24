package com.prefixsum;

public class CountEvenNumbersInRange_6 {
    public static void main(String[] args) {
        int[] A = {3,4,6,7,1,0,2,12,10};
        int[][] B = {{0,4},{2,6},{1,8}};
        int[] ans = numberOfEven(A,B);
        for(Integer i : ans){
            System.out.print(i+" ");
        }
    }
    public static int[] numberOfEven(int[] ar, int[][] B){
        int n = ar.length;
        int countEven[] = new int[B.length];
        int[] pcount = ConstructPrefixCountArray_5.pCountAr(ar);
        for(int i=0;i<B.length;i++){
            int s = B[i][0];
            int e = B[i][1];
            if(i > 0){
                countEven[i] = pcount[e] - pcount[s-1];
            }else{
                countEven[i] = pcount[e];
            }
        }
        return countEven;
    }
}
