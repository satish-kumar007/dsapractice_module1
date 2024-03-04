package com.recursion2;

public class MagicNumberPractice {
    public static void main(String[] args) {
        System.out.println(solve(83557));
        System.out.println(solve(1291));
        System.out.println(solve(10));

    }
    public static int solve(int A) {
        while(A > 9){
            A = checkMagic(A);
        }
        if(A==1) return 1;
        else return 0;
    }

    public static int checkMagic(int A){
        if(A == 0) return 0;
        else return A%10+checkMagic(A/10);
    }
}
