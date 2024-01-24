package com.dsaintro;

public class OptimizedPrimeNumberCheck_1 {
    public static void main(String[] args) {
        int x = countFactor(12);
        System.out.println(x);
        boolean prime = checkPrime(12);
        System.out.println(prime);
    }
    public static boolean checkPrime(int N){
        boolean isPrime=false;
        int countFactor = countFactor(N);
        if(countFactor == 2){
            isPrime=true;
        }
        return isPrime;
    }
    public static int countFactor(int N){
        int count=0;
        for(int i=1;i*i<=N;i++){
            if(N%i == 0){
                if(i == N/i){
                    count=count+1;
                }else{
                    count=count+2;
                }
            }
        }
        return count;
    }
}
