package com.recursion;

public class PrintFactorial {
    public static int fact(int N){
        if(N <= 1){
            return 1;
        }
        return N*fact(N-1);
    }

    public static void main(String[] args) {
        int x = fact(5);
        System.out.println(x);
    }
}
