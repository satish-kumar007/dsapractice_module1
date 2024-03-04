package com.mathsprimenumbers;

public class CheckNumberForPrime {
    public static void main(String[] args) {
        System.out.println(checkForPrime(-47));
        System.out.println(checkForPrime(101));
        System.out.println(checkForPrime(23));
        System.out.println(checkForPrime(4));
    }
    public static boolean checkForPrime(int n){
        if(countFactors(n) == 1){
            return true;
        }
        return false;
    }
    public static int countFactors(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                if(i == n/i){
                    count++;
                }else{
                    count=count+2;
                }
            }
        }
        if(count==2){
            return 1;
        }
        return 0;
    }
}
