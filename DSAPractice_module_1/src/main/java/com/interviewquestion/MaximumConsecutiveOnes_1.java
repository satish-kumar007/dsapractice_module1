package com.interviewquestion;
//Need Deepika Ma'am support for input: 111000
public class MaximumConsecutiveOnes_1 {
    public static void main(String[] args) {
        String str = "111011101";
        char[] ch = str.toCharArray();
        int[] ans = new int[ch.length];
        for(int i=0;i<ch.length;i++){
            if(ch[i] == 49)   ans[i] = 1;
            else ans[i] = 0;
            }
        for(Integer i : ans){
            System.out.print(i+" ");
        }
        System.out.println();
        int m = ans.length;
        System.out.println(m);
        int x = maxOnes(ans);
        System.out.println(x);
    }
    public static int maxOnes(int[] arr){
        int n = arr.length;
        int count=0;
        int maxOnes=0;
        for(int i=0;i<n;i++){
            if(arr[i] == 1){
                count++;
            }
        }
        if(count == 0) return 1;
        if(count == n) return n;

        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                //count 1's from left
                int left=0;
                for(int j=i-1;j>=0;j--){
                    if(arr[j] == 1){
                        left++;
                    }else{
                        break;
                    }
                }
                //count 1's from right
                int right = 0;
                for(int j=i+1;j<n;j++){
                    if(arr[j] == 1){
                        right++;
                    }else{
                        break;
                    }
                }
                System.out.println(left+"   "+right);
                maxOnes = Math.max(maxOnes,(left+right+1));
            }
        }
        return maxOnes;
    }
}
