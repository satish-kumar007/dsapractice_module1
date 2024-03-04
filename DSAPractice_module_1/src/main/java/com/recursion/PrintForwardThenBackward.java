package com.recursion;

public class PrintForwardThenBackward {
    public static void main(String[] args) {
        printForwardBackward(20);
    }

    public static void printForwardBackward(int N){
        if(N <= 0)
            return;
        System.out.print(N+" ");
        printForwardBackward(N-1);
        System.out.print(N+" ");


    }
}
