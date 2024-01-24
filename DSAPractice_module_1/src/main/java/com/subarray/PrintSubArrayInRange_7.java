package com.subarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintSubArrayInRange_7 {
    public static void main(String[] args) {
        //int[] arr = {2,8,-1,4};
        List<Integer> A = Arrays.asList(2,8,-1,4);
        int B = 1;
        int C = 3;
        ArrayList<Integer> ans = printSubArrayInRange(A,B,C);
        for(Integer i : ans){
            System.out.print(i+" ");
        }
    }
    public static ArrayList<Integer> printSubArrayInRange(List<Integer> arr, int A, int B){
        int start = A;
        int end = B;
        ArrayList<Integer> ans = new ArrayList<>();
        //int n = arr.length;
        for(int s=start;s<=end;s++){
            ans.add(arr.get(s));
        }
        return ans;
    }
}
