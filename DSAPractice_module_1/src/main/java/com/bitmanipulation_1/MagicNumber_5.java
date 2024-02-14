package com.bitmanipulation_1;

public class MagicNumber_5 {
    public static void main(String[] args) {
        int A = 3;
        int ans=0, power=5;
        while(A > 0){
            int rem = A%2;
            A = A/2;
            ans+=(rem*power);
            power*=5;
        }
        System.out.println(ans);
    }
}
