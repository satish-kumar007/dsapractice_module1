package com.mathsprimenumbers;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimesEndWith3 {
    public static void main(String[] args) {
        System.out.println(getPrimes1ToN(50));
    }
    public static ArrayList<Integer> getPrimes1ToN(int n){
        boolean primes[] = new boolean[n+1];
        ArrayList<Integer> primeList = new ArrayList<>();
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;
        for(int i=2;i*i<=n;i++){
            primes[i] = true;
            for(int j=i*i;j<=n;j=j+i){
                primes[j] = false;
            }
        }
        for(int i=2;i<=n;i++){
            if(primes[i] == true && i%10 == 3){
                int rem = i%10;
                //if()
                primeList.add(i);
            }
        }
        return primeList;
    }
}
