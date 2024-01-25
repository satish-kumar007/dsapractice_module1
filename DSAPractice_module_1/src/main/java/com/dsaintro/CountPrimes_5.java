package com.dsaintro;

public class CountPrimes_5 {
    public static void main(String[] args) {
        int x = countPrimes(19);//Primes <= 19 are 2, 3, 5, 7, 11, 13, 17, 19
        System.out.println(x);
    }
    public static int countPrimes(int A){
        int countPrimes=0;
        for(int j=2;j<=A;j++){
            int countFactor=0;
            for(int i=1;i<=j;i++){
                if(j%i == 0){
                    countFactor++;
                }
            }
            if(countFactor==2){
                countPrimes++;
            }
        }
        return countPrimes;
    }
}
