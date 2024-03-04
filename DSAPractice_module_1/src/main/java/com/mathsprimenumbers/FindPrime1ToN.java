package com.mathsprimenumbers;

import java.util.ArrayList;
import java.util.Arrays;

public class FindPrime1ToN {
    public static void main(String[] args) {
        System.out.println(prime1ToN(50));
    }
    public static ArrayList<Integer> prime1ToN(int n){
        boolean prime[] = new boolean[n+1];
        ArrayList<Integer> primeList = new ArrayList<>();
        Arrays.fill(prime,true);//This line will set true to all numbers
        prime[0] = false;//0 can't a prime
        prime[1] = false;//1 can't a prime
        for(int i=2;i*i <= n;i++){
            prime[i] = true;//mark all the multiples of 2 onwards as prime
            for(int j=i*i;j<=n;j=j+i){
                prime[j] = false;//mark all the multiple of i not prime
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i] == true){//check prime left after filter
                primeList.add(i);//add them to the list
            }
        }
        return primeList;
    }
}
