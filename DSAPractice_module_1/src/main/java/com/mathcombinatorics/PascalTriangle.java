package com.mathcombinatorics;

public class PascalTriangle {

    public static void main(String[] args) {
        printPascalTriangle(4);
    }
    public static int factorial(int N){
        if(N==0) return 1;
        return N * factorial(N-1);
    }
    public static int nCr(int N, int r){
        return factorial(N) / (factorial(r) * factorial(N-r));
    }
    public static void printPascalTriangle(int N){
        for(int i=0;i<=N;i++){
            for(int j=0;j<= N-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" "+nCr(i,j));
            }
            System.out.println();
        }
    }
}
