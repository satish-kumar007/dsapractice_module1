package com.string;

public class LongestPalindromeBruteForce_2 {
    public static void main(String[] args) {
        String str = "aabacabad";//abacaba
        int count = getLongestPalindromeStatics(str);
        System.out.println(count);
    }
    public static int getLongestPalindromeStatics(String str){
        int n=str.length();
        char[] ch = str.toCharArray();
        int s=0;
        int e=n-1;
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(CheckStringForPalingdrom_1.checkPalingdromeInRange(str,i,j)){
                    count = Math.max(count, j-i+1);
                }
            }
        }
        return count;
    }
}
