package com.recursion2;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int A= 3;
        int m = (1 << A);
        System.out.println(m);
    }

    int currentPos;
    int[][] ans;
    public int[][] towerOfHanoi(int disks) {
        currentPos = 0;
        int m = (1 << disks) - 1; //How did you conclude rows length?
        ans = new int[m][3];
        rec(disks, 1, 3);
        return ans;
    }
    public void rec(int disk, int start, int end){
        int temp = 6 - start - end;
        if(disk == 1){
            ans[currentPos++] = new int[]{disk, start, end};
            return;
        }
        // move top (disk - 1) disks from start to buffer, using end as a buffer
        rec(disk - 1, start, temp);
        // move top from start to end
        ans[currentPos++] = new int[]{disk, start, end};
        // move top (disk - 1) disks from buffer to end, using start as a buffer
        rec(disk - 1, temp, end);
    }
}
