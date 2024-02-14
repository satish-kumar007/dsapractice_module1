package com.bitmanipulation_2;

public class DistinctSingleNumberOptimization_1 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,2,3,4,5,6};
        int n = arr.length;
        int ans = 0;
        for(int i=0;i<32;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if((arr[j] & (1 << i)) > 0 ){ // check for set bits
                    count++;
                }
            }
            if((count & 1) == 1){
                ans = ans | (1 << i); // set bits
            }
        }
        System.out.println(ans);
    }
}
