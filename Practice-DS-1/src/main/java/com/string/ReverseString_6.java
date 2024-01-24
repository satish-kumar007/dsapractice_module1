package com.string;

public class ReverseString_6 {
    public static void main(String[] args) {
        String A = "academy";
        String s = solve(A);
        //System.out.println(s);
    }
    public static String solve(String A) {
        StringBuilder sb = new StringBuilder(A);
        String rev = sb.reverse().toString();
        System.out.println(rev);
        return rev;
    }

    public String replaceSpacesToOne(String A) {
        String s[] = A.split(" ");
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--) {
            ans += s[i]+" ";
        }
        ans = ans.replaceAll("\\s+"," ").trim();
        return ans;
    }

    public String vowelStringReplace(String A) {
        String concat = A.concat(A);
        char[] ch = concat.toCharArray();
        String ans=null;
        StringBuilder sb = new StringBuilder(concat);
        for(int i=ch.length-1;i >=0;i--){
            if(ch[i]>=65 && ch[i]<=90){
                sb.deleteCharAt(i);
            }
            if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i' || ch[i]=='o'|| ch[i]=='u'){
                sb.setCharAt(i,'#');
            }
        }
        ans = sb.toString();
        return ans;
    }
}
