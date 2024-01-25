package com.dsaintro;

public class FindPerfectNumber_4 {
    public static void main(String[] args) {
        int x = checkPerfectNumber(6);//divisor of 6 are 1,2,3 => 1+2+3=6
        System.out.println(x);
    }
    public static int checkPerfectNumber(int A){
        int sum=0;
        int ans=0;
        for(int i=1;i<A;i++){
            if(A%i == 0){
                sum = sum+i;
            }
        }
        if(sum == A){
            ans=1;
        }
        return ans;
    }
}
