package com.recursion;

public class SumOfDigitsRecursion {
    public static int sumDigits(int N){
        if(N==0) return 0;
        return (N%10 + sumDigits(N/10));
    }

    public static void main(String[] args) {
        int N=469;
        System.out.println(sumDigits(N));
    }
}
