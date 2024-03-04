package com.bitmanipulation_2;

public class ArrayLen {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5,6,7,8,4};
        int arrlen = 0;
        for(int i=1;i*i<=x.length;i++){
            arrlen = i;
        }
        System.out.println(arrlen);
    }
}
