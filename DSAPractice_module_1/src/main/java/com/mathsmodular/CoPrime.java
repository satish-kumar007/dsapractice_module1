package com.mathsmodular;
/*
You are given two positive numbers A and B . You need to find the maximum valued integer X such that:

X divides A i.e. A % X = 0
X and B are co-prime i.e. gcd(X, B) = 1
 */
public class CoPrime {
    public int cpFact(int A, int B) {
        int X = A;
        int g = gcd(X,B);
        while(g!=1){
            X /= g;
            g = gcd(X,B);
        }
        //System.out.println(X);
        return X;
    }

    public static int gcd(int A, int B) {
        int divisor = A;
        int divident = B;
        int remander = divident % divisor;

        while (remander != 0){
            divident = divisor;
            divisor = remander;
            remander = divident % divisor;
        }
        //System.out.println(divisor);
        return divisor;
    }
}
