package com.bitmanipulation_2;

import java.util.Arrays;

public class TwoElementsOcurringTwice_3 {
    public int[] solve(int[] A) {
        int n = A.length;
        int xorElement = 0;
        int[] ans = new int[2];
        for(int i=0;i<n;i++){
            xorElement = xorElement^A[i];
        }
        int index = -1;
        for(int i=0;i<32;i++){
            if((xorElement & (1 << i)) > 0){
                index = i;
                break;
            }
        }
        int set=0, unset=0;
        for(int i=0;i<n;i++){
            int element = A[i];
            if((element & (1 <<index)) > 0){
                set = set ^ element;
            }else{
                unset = unset^element;
            }
        }
        ans[0] = set;
        ans[1] = unset;
        Arrays.sort(ans);
        // System.out.println(set+"   :: "+unset);
        // for(Integer i : ans){
        //     System.out.print(i+" ");
        // }
        return ans;
    }
}
