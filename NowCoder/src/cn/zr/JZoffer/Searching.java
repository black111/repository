package cn.zr.JZoffer;

import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {
        int target =1;
        int[][] a = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(Find(target,a));
    }

    //牛客网剑指offer题1：二维数组中的查找
    public static boolean Find(int target, int [][] array) {
        for (int i= 0 ;i<array.length;i++){
            for (int j =0;j<array[i].length;j++){
                int a =Arrays.binarySearch(array[i],target);
                if(a>=0)return true;
            }
        }
        return false;
    }
}
