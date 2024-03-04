package com.recursion;

public class PrintNumberBackward {
    public static void main(String[] args) {
        printBackward(20);
    }
    public static void printBackward(int N){
        if(N<=0)
            return;
        System.out.print(N+" ");
        printBackward(N-1);
    }
}
