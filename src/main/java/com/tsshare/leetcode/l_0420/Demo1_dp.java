package com.tsshare.leetcode.l_0420;

/**
 * @author chenzhenfei
 * @title: Demo1
 * @projectName leetcode
 * @description: 动态规划：举一反三 1
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 * 输入: coins = [1, 2, 5], amount = 11，输出: 3  解释: 11 = 5 + 5 + 1
 * 输入: coins = [2], amount = 3，输出: -1
 *
 * 链接：https://leetcode-cn.com/circle/article/lxC3ZB/
 * @date 2020/4/210:10
 */
public class Demo1_dp {
    /**
     * dp 状态：我们定义 DP(i) 为凑够零钱 i 需要的最小值
     * dp 转移方程： DP[i] =  min{ DP[ i - coins[j] ] + 1 } = min{ DP[ i - coins[j] ]} + 1,  其中 j 的取值为 0 到 coins 的大小，i 代表取了 coins[j] 这一枚硬币。
     *
     */
    public static void main(String[] args) {
        int[] coins =new int[]{1, 2, 5};
        int amout=11;
        int i = exchangeDP(amout, coins);
        System.out.println(i);
    }


    private static int exchangeDP(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        // 初始化每个值为 amount+1，这样当最终求得的 dp[amount] 为 amount+1 时，说明问题无解
        for (int i = 0; i < amount + 1; i++) {
            dp[i] = amount + 1;
        }

        // 0 硬币本来就没有，所以设置成 0
        dp[0] = 0;

        for (int i = 0; i < amount + 1; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    dp[i] = Math.min(dp[i- coins[j]]+1, dp[i]);
                }
            }
        }

        if (dp[amount] == amount + 1) {
            return -1;
        }
        return dp[amount];
    }

}
