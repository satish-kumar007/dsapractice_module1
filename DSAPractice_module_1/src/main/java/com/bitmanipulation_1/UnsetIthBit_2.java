package com.bitmanipulation_1;

public class UnsetIthBit_2 {
    public static void main(String[] args) {
        int A=41, B=2;
        if((A & (1 << B)) == 0){
            System.out.println("Bit is unset already lets make it set");
            A = A + (int) Math.pow(2,B); // Set Bit
            int X = (A | (1 << B)); //second way
            System.out.println(A+" == "+X);
        }else{
            System.out.println("Bit is set already lets make it unset");
            A = A - (int) Math.pow(2,B); // unset Bit
            System.out.println(A);
        }

    }
    public int solve(int A, int B) {
        int x = 0;
        if((A & (1 << B)) == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        return A;
    }
}
