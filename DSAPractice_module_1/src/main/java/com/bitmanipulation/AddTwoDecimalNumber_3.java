package com.bitmanipulation;

public class AddTwoDecimalNumber_3 {
    public static void main(String[] args) {
        int x = addDecimal(789,142);
        System.out.println(x);
    }
    public static int addDecimal(int num1, int num2){
        int sumAll=0;
        int carry=0;
        int multi = 1;
        while(num1>0 || num2>0 || carry>0){
            int d1 = num1%10;
            int d2 = num2%10;
            num1 = num1/10;
            num2 = num2/10;
            int sum = d1+d2+carry;
            int rem = sum%10;
            carry = sum/10;
            sumAll = sumAll+(rem * multi);
            multi = multi*10;
        }
        return sumAll;
    }
}
