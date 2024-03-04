package com.recursion;

public class CheckPalindromeRecursion {
    public static int isPalindrome(String str){
        if(str.length() == 0 || str.length() == 1) return 1;
        if(str.charAt(0) != str.charAt(str.length()-1)) return 0;
        return isPalindrome(str.substring(1, str.length()-1));
    }
    public static int solve(String A) {
        int palindrome = isPalindrome(A);
        return palindrome;
    }

    public static void main(String[] args) {
        String str = "DALAD";
        System.out.println(solve(str));
    }
}
