package com.string;

public class AmazingSubArraySubString {
    public int solve(String A) {
        int cnt=0;
        String vowel = "aeiouAEIOU";
        char[] ch = vowel.toCharArray();
        char[] str = A.toCharArray();
        for(int i=0;i<A.length();i++){
            for(int j=0;j<vowel.length();j++){
                if(str[i]==ch[j]) {
                    cnt=(cnt+(A.length()-i))%10003;
                    break;
                }
            }
        }
        //System.out.println(cnt);
        return cnt;
    }
}
