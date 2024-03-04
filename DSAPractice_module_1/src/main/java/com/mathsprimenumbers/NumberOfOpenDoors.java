package com.mathsprimenumbers;

public class NumberOfOpenDoors {
    public static int countOpenDoors(int doors) {
        return (int)Math.sqrt(doors);//opened doors : Only the perfect square is the opened one.
    }
    public static void main(String[] args) {
        System.out.println(countOpenDoors(100));
    }
}
