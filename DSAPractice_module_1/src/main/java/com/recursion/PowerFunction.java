package com.recursion;

public class PowerFunction {
    public static void main(String[] args) {
        int num = 2;
        int pow = 15;
        System.out.println(powerFunc(num,pow));
        System.out.println(simplePowFunction(num,pow));
        System.out.println(moreOptimized(num,pow));
    }
    public static int simplePowFunction(int a, int n){
        if(n==0)
            return 1;
        return simplePowFunction(a,n-1)*a;
    }
    public static int powerFunc(int num, int power){
        if(power==0) return 1;
        if((power & 1) == 0){
            return powerFunc(num,power/2) * powerFunc(num,power/2);
        }else{
            return powerFunc(num,power/2) * powerFunc(num,power/2) * num;
        }
    }

    public static int moreOptimized(int a, int n){
        if(n==0) return 1;
        int value = moreOptimized(a,n/2);
        if((n&1) == 0)
            return value*value;
        else
            return value*value*a;
    }
}
