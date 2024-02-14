package com.bitmanipulation_1;

public class FIndGoodDay {
    public static void main(String[] args) {
        int A = 5;
        int ans = 0;
        while(A>0){
            if(A%2==1) ans++;
            A /= 2;
        }
        System.out.println(ans);
    }
}
