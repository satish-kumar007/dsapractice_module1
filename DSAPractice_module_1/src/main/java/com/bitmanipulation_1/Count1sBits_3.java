package com.bitmanipulation_1;

public class Count1sBits_3 {
    public static void main(String[] args) {
        int num = 45;
        int count=0;
        for(int i=0;i<32;i++){
            if((num & (1 << i)) != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
