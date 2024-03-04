package com.mathsmodular;

public class PairSumMod {
    public static int returnPairs(int[] arr, int m){
        int n = arr.length;
        int[] freq = new int[m];
        int ans = 0;
        for(int i=0;i<n;i++){
            int val = arr[i]%m;
            int pair = m-val;
            if(val == 0)
                pair=0;
            ans = ans+freq[pair];
            freq[val]++;
        }
        return ans%100000007;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int B = 2;

        int[] As = {5, 17, 100, 11};
        int Bs = 28;

        System.out.println(returnPairs(A,B));
        System.out.println(returnPairs(As,Bs));
    }
}
