package com.bitmanipulation;

public class DecimalToBinaryConversion_2 {
    public static void main(String[] args) {
        int x = convertNumber(37);
        System.out.println(x);
    }
    public static int convertNumber(int num){
        int multiplier = 1;
        int number=0;
        while(num > 0){
            int rem = num % 2;
            num = num/2;
            number = number +(rem * multiplier);
            multiplier = multiplier*10;
        }
        return number;
    }
}
