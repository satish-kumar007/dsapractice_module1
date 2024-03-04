package com.mathsprimenumbers;

import java.util.ArrayList;

public class PrimeSum {
    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> primeList = new ArrayList();
        boolean isPrime[] = new boolean[A + 1];
        checkPrime(A, isPrime);
        for (int i = 0; i < A; i++) {
            if (isPrime[i] && isPrime[A - i]) {
                primeList.add(i);
                primeList.add(A-i);
                break;
            }
        }
        //System.out.println(primeList);
        return primeList;
    }

    public static boolean checkPrime(int n, boolean isPrime[]){
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= n; i++)
            isPrime[i] = true;
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    isPrime[i] = false;
            }
        }
        return false;
    }
}
