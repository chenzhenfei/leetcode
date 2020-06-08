package com.tsshare.niuke.huawei.hw_js1_2020;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 数组跳跃最值问题 {2,3,2,1,2,1,5} ，2->5 最小跳跃步数  - 迭代
 */
public class Hw_2020_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int minStep = jump(arr);
        System.out.println(minStep);
    }
    //{2,3,2,1,2,1,5}
    private static int jump(int[] arr) {
        int len =arr.length;
        if(arr[0]>=arr.length-1){
            return 1;
        }else{
            int[] ints_next = Arrays.copyOfRange(arr, 1, arr.length);
            //加判断
            int[] ints_jump = Arrays.copyOfRange(arr, arr[0], arr.length);
            return Math.min(jump(ints_next),jump(ints_jump))+1;
        }
    }

}
