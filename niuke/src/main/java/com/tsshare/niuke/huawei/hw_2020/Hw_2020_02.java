package com.tsshare.niuke.huawei.hw_2020;

import java.util.Scanner;

/**
 * 数组跳跃最值问题 arr ={2,3,2,1,2,1,5} ，2->5 最小跳跃步数 - 动态规划
 *
 */
public class Hw_2020_02 {
    //{2,3,4,4,2,1,5}
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

    /**
     * 分析： 想找到 到 末尾数字的最小跳数，就要找到距离末尾 可以一步跳到的 位置 list ,变化成找到跳到这些list 位置上前每个点的最小跳数，
     * 然后比较 取最小的值 +1 ,以此索源到起点的最小跳数为0;
     *
     * dp[i] 标识到达i 位置的最小跳数
     * 求 dp[arr.length-1]的最小跳数，需要检测从七点跳到每个位置的最小跳数，然后累计求去跳到最后一个点的条数
     *
     * 状态方程：dp[i] = min(dp[i],dp[j]+1)
     *
     * @param arr
     * @return
     */
    private static int jump(int[] arr) {
        // 记录当前节点到末尾的最小跳跃次数
        int[] dp =new int[arr.length];
        dp[0] =0;
        for (int i = 1; i <arr.length ; i++) {
            //循环每个位置
            // 为了不被超越作为一个基础
            dp[i] =Integer.MAX_VALUE;
            //循环去处理 从 0 位置到 i 位置的最小跳数
            for (int j = 0; j <i ; j++) {
                // 保证能够从j跳到i 位置
                if(i-j<=arr[j]){
                    dp[i]=Math.min(dp[i],dp[j]+1);
                }
            }
        }
        return dp[arr.length-1];
    }
}
