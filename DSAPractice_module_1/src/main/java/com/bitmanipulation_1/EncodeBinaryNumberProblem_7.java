package com.bitmanipulation_1;

public class EncodeBinaryNumberProblem_7 {
    public static void main(String[] args) {
        int numOfAs = 4;//put 0's
        int numOfBs = 3;//put 1's
        int numOfCs = 1;//put 0's
        int totalBits = numOfBs+numOfCs;
        long ans = 0;
        for(long i=numOfCs;i<totalBits;i++){
            ans = ans | (1 << i);
        }
        System.out.println(ans);
    }
}
