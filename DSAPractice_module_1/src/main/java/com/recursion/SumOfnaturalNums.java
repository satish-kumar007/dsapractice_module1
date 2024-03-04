package com.recursion;

public class SumOfnaturalNums {
    public static void main(String[] args) {
        int x = sumNaturalNum(5);
        System.out.println(x);
    }
    public static int sumNaturalNum(int N){
        if(N==1){
            return 1;
        }
        return sumNaturalNum(N-1)+N;
    }
}
