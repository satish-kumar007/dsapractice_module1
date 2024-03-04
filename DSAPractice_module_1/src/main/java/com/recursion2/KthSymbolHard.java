package com.recursion2;

public class KthSymbolHard {
    public static int find(int n, long k){
        if(k==0){
            return 0;
        }
        int val = find(n- 1 , k / 2);
        if(k % 2 == 0){
            return val;
        }
        return 1 - val;
    }
    public static int solve(int A, long B) {
        return find(A, B);
    }

    public static void main(String[] args) {
        solve(4,4);
    }
}
