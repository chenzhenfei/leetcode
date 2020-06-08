package com.tsshare.niuke.huawei.hw_js1_2020;

import java.util.Scanner;

/**
 * @author chenzhenfei
 * @title: Main1
 * @projectName leetcode
 * @description: TODO
 * @date 2020/5/2120:50
 */
public class Hw_2020_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(jump(n - 1, num));
    }
    //{2,3,2,1,2,1,5}
    public static int jump(int end, int[] num) {
        if (end == 0) {
            return 0;
        }
        int i = 0;
        while (num[i] < (end - i)) {
            i++;
        }
        return 1 + jump(i, num);
    }


}
