package com.bitmanipulation_1;

public class HelpFromSam_6 {

    public static void main(String[] args) {
        int A=5;
        int cnt=0;
        for(int i=0;i<32;i++){
            if((A & (1<<i)) != 0)
                cnt++;
        }
        System.out.println(cnt);
    }
}
