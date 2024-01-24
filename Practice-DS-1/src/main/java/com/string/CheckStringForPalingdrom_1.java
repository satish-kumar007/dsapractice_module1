package com.string;

public class CheckStringForPalingdrom_1 {
    public static void main(String[] args) {
        String str = "anamadamspe";
        boolean b = checkPalingdromeInRange(str,3,7);
        System.out.println(b);
    }
    public static boolean checkPalingdromeInRange(String str, int s, int e){
        int n = str.length();
        char[] ch = str.toCharArray();
        while(s<e){
            if(ch[s] != ch[e]){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
