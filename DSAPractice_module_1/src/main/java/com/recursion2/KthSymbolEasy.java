package com.recursion2;

import java.util.ArrayList;

/*
On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.

Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).
 */
public class KthSymbolEasy {
    public static void main(String[] args) {
        int A = 4;
        int B = 4;
        int x = solve(A,B);
        System.out.println(x);
    }
    public static int solve(int A, int B) {
        return rowsData(A).get(B);
    }

    public static ArrayList<Integer> rowsData(int A){
        if(A == 1) {
            ArrayList<Integer> v2 = new ArrayList<>();
            v2.add(0);
            return v2;
        }
        ArrayList<Integer> v1 = rowsData(A-1);//use of recursion
        ArrayList<Integer> v2 = new ArrayList<>();
        for(int i=0;i<v1.size();i++){
            if(v1.get(i) == 0){
                v2.add(0);
                v2.add(1);
            }else{
                v2.add(1);
                v2.add(0);
            }
        }
        return v2;
    }
}
