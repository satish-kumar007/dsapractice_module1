package com.mathsprimenumbers;

public class SmallestPrimeFactor {
    public static void main(String[] args) {
        int []x = getFactors(50);
        for(Integer i : x){
            System.out.print(i+" ");
        }
    }
    public static int[] getFactors(int n){
        int spf[] = new int[n+1];
        for(int i=2;i<=n;i++){
            spf[i] = i;
        }

        for(int i=2;i*i<=n;i++){
            if(spf[i] == i){
                for(int j=i*i;j<=n;j=j+i){
                    if(spf[j] == j){
                        spf[j] = i;
                    }
                }
            }
        }
        for(Integer i : spf){
            System.out.print(i+" ");
        }
        return spf;
    }
}
