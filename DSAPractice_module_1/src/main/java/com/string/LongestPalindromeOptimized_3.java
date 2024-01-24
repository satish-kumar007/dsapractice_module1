package com.string;

public class LongestPalindromeOptimized_3 {
    public static void main(String[] args) {
        String str = "aabacabad";//abacaba
        int count = palindromeLength(str);
        System.out.println(count);
    }
    public static int expand(char[] ch, int p1, int p2){
        int n = ch.length;
        while(p1 >= 0 && p2<n && ch[p1] == ch[p2]){
            p1--;
            p2++;
        }
        return (p2-p1-1);
    }

    public static int palindromeLength(String str){
        int n = str.length();
        char[] ch = str.toCharArray();
        int count=0;
        //odd length
        for(int i=0;i<n;i++){
            int p1=i,p2=i;
            int len = expand(ch,p1,p2);

            count = Math.max(count,len);
        }

        //even length
        for(int i=0;i<n-1;i++){
            int p1=i,p2=i+1;
            int len = expand(ch,p1,p2);
            count = Math.max(count,len);
        }
        return count;
    }
}
