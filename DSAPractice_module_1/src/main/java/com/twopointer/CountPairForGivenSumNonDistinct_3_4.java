package com.twopointer;

public class CountPairForGivenSumNonDistinct_3_4 {
    public static int printPairs(int A[], int B) {
        int count = 0;
        int[] ans = new int[B];
        for (int i = 0; i < A.length; ++i) {
            int complement = B - A[i];
            if (complement >= 0) {
                System.out.println(complement+"===");
                count += ans[complement];
            }else{
                return count;
            }
            if(i < A.length){

            }
            ans[A[i]]++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] A = {2,3,5,6,10};
        int B = 6;
        int x = printPairs(A,B);
        System.out.println(x);
    }
}
