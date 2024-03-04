package com.recursion;

public class PrintNumberForward {
    public static void main(String[] args) {
        printForward(20);
    }

    public static void printForward(int N){
        if(N<=0)
            return;
        printForward(N-1);
        System.out.print(N+" ");
    }
}
