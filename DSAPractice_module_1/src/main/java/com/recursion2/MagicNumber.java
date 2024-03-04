package com.recursion2;
/*
Given a number A, check if it is a magic number or not.

A number is said to be a magic number if the sum of its digits is calculated till a single digit
recursively by adding the sum of the digits after every addition. If the single digit comes out to
be 1, then the number is a magic number.
 */
public class MagicNumber {
    public static void main(String[] args) {
        int x = solve(83557);
        System.out.println(x);
    }
    public static int solve(int A) {
        while(A > 9){
            A = calculateSum(A);
        }
        if(A==1){
            return 1;
        }else{
            return 0;
        }
    }
    public static int calculateSum(int A){
        if(A==0) return 0;
        else return A%10 + calculateSum(A/10); //recursion
    }
}
