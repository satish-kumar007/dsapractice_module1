package com.mathsmodular;

public class GCDivisor {
    public static int commonDivi(int a, int b){
        int divident=a;
        int divisor=b;
        int remander = divident%divisor;
        if(divident < 0)
            return (divident%divisor+divisor)%divisor;
        while(remander!=0){
            divident = divisor;
            divisor = remander;
            remander = divident%divisor;
        }
        return divisor;
    }

    public static void main(String[] args) {
        System.out.println(commonDivi(25,10));
        System.out.println(commonDivi(8,28));
        System.out.println(commonDivi(-35,5));
        System.out.println(commonDivi(-40,7));
        System.out.println(commonDivi(-60,9));
        System.out.println(commonDivi(9,-60));
    }
}
