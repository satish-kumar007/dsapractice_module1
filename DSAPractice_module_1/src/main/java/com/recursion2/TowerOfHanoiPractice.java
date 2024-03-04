package com.recursion2;

public class TowerOfHanoiPractice {
    int currentPos;
    int ans[][];

    public int[][] solve(int disk){
        currentPos=0;
        int rows = (1 << disk) - 1;
        ans = new int[rows][3];
        recursionMovement(disk,1,3);
        return ans;
    }

    public void recursionMovement(int disk, int start, int end){
        int temp = 6-start-end;
        if(disk == 1){
            ans[currentPos++] = new int[]{disk, start,end};
            return;
        }
        recursionMovement(disk-1, start,temp);
        ans[currentPos++] = new int[]{disk, start,end};
        recursionMovement(disk-1, temp,end);
    }
}
