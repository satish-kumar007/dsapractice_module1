package com.recursion;

public class Fibbonaci {
    public static int fib(int N){
        if(N == 0){
            return 0;
        }
        if(N==1 || N==2){
            return 1;
        }
        return fib(N-2) + fib(N-1);
    }

    public static void main(String[] args) {
        //int x = fib(4);
        for(int i=0;i<50;i++){
            System.out.print(fib(i)+" ");
        }

    }
}
