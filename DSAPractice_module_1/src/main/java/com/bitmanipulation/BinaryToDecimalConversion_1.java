package com.bitmanipulation;

public class BinaryToDecimalConversion_1 {
    public static void main(String[] args) {
        int x = convertNum(1011);
        System.out.println(x);
    }
    public static int convertNum(int num){
        int number = 0;
        int multiplier = 1;

        while(num > 0){
            int remainder = num%10;
            num = num/10;
            number = number +(remainder * multiplier);
            multiplier = multiplier*2;
        }
        return number;
    }
}
