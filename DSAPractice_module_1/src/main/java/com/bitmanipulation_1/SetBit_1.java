package com.bitmanipulation_1;

public class SetBit_1 {
    public static void main(String[] args) {
        int x = 41;
        System.out.println((x & (1 << 2)));
        System.out.println((x | (1 << 1)));
        System.out.println((x | (1 << 2)));

        System.out.println((x | (0 << 2)));
    }
}
