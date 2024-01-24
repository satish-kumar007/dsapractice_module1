package com.string;

public class StringToggleCase_5 {
    public static String solve(String A) {
        String ansStr ="";
        char[] ch = A.toCharArray();
        int n = ch.length;
        for(int i=0;i<n;i++){
            if(ch[i] >= 65 && ch[i] <=90){
                ch[i] = (char)(ch[i]+32);
            }else if(ch[i] >= 97 && ch[i] <=122){
                ch[i] = (char)(ch[i] - 32);
            }
        }
        ansStr = String.valueOf(ch);
        return ansStr;
    }

    public static void main(String[] args) {
        String A = "tHiSiSaStRiNg";
        String s = solve(A);
        System.out.println(s);
    }
}
