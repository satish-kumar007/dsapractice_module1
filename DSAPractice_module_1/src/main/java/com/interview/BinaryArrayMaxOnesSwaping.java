package com.interview;

public class BinaryArrayMaxOnesSwaping {
    public int solve(String A) {
        int countOnes = 0;
        int n=A.length();
        int leftSide[] = new int[n];
        int rightSide[] = new int[n];

        for (int i=0;i<n;i++) {
            if (A.charAt(i) == '1')
                countOnes++;
        }

        if (A.charAt(0) == '1')  leftSide[0] = 1; else leftSide[0] = 0;
        if (A.charAt(n-1) == '1') rightSide[n - 1] = 1; else rightSide[n - 1] = 0;

        for (int i = 1; i < n; i++) {
            if (A.charAt(i) == '1')
                leftSide[i] = leftSide[i - 1] + 1;
            else
                leftSide[i] = 0;
        }

        for (int i = n - 2; i >= 0; i--) {
            if (A.charAt(i) == '1')
                rightSide[i] = rightSide[i + 1] + 1;
            else
                rightSide[i] = 0;
        }

        int cnt = 0, max_cnt = 0;
        for(int i=0; i<n; ++i )
            max_cnt=Math.max(max_cnt,Math.max(rightSide[i],leftSide[i]));

        for (int i = 1; i < n - 1; i++) {
            if (A.charAt(i) == '0') {
                int sum = leftSide[i - 1] + rightSide[i + 1];
                if (sum < countOnes)
                    cnt = sum + 1;
                else
                    cnt = sum;
                max_cnt = Math.max(max_cnt, cnt);
                cnt = 0;
            }
        }
        return max_cnt;
    }
}
