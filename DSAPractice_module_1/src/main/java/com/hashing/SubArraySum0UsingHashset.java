package com.hashing;

import java.util.HashSet;

import static com.prefixsum.ConstructPrefixSumArray_1.getPrefixSum;

public class SubArraySum0UsingHashset {
    //Observation 1: Create a prefix sum array and check for sum duplication.
    //Observation 2: populate 0 in the hashset and then check is for next 0 element.

    public static boolean SubArraySum0(int[] arr){
        int[] psum = getPrefixSum(arr);
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        for(int i=0;i< psum.length;i++){
            if(set.contains(psum[i])){
                return true;
            }else{
                set.add(psum[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,-3,4,3,1,-2,-3,2};
        int[] arr1 = {2,-5,3,6};//psum = 2, -3, 0, 6
        System.out.println(SubArraySum0(arr));
        System.out.println(SubArraySum0(arr1));
    }
}
