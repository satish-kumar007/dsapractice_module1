package com.bitmanipulation;

public class AddTwoBinaryNumber_4 {
    public static void main(String[] args) {
        String x = addBinary("10110","00111");
        System.out.println(x);
    }
    public static String addBinary(String num1, String num2){
        int number0 = Integer.parseInt(num1, 2);
        int number1 = Integer.parseInt(num2, 2);
        int sum = number0 + number1;
        return Integer.toBinaryString(sum);
    }
}
