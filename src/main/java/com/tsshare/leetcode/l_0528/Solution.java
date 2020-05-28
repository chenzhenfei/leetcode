package com.tsshare.leetcode.l_0528;

import java.util.Scanner;

/**
 * @author : zfchen
 * @version 1.0
 * @Description: 硬币。给定数量不限的硬币，币值为25分、10分、5分和1分，编写代码计算n分有几种表示法。(结果可能会很大，你需要将结果模上1000000007)
 * @date : 2020-05-28 14:43
 */
public class Solution {
    public static void main(String[] args) {
        int[] coins ={1,5,10,25};
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int res = calc(n, coins);
        System.out.println(res);
    }

    /**
     * 要求 n 值的总的组成数量 = 求出 n 值 - coins任何一个值的面值的组成数量
     * 求 35 分 = 求34 分，30 分，25，分，10分 中已经能够组成子项的数量只和
     * 循环硬币数
     * dp[35] =dp[35-coins[i]] +dp[35];
     * 状态方程：dp[i]=dp[i-coins[j]]+dp[i]  //循环处理可选硬币情况
     * 动态规划：
     *
     * @param n
     * @param coins
     * @return
     */
    private static int calc(int n, int[] coins) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= n; i++) {
                if (i - coin < 0) {
                    break;
                }
                dp[i] = (dp[i] + dp[i - coin]) % 1000000007;
            }
        }
        return dp[n];
    }


}
