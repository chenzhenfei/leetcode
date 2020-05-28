package com.tsshare.leetcode.l_0528;

import java.util.Scanner;

/**
 * @author : zfchen
 * @version 1.0
 * @Description: 硬币。给定数量不限的硬币，币值为25分、10分、5分和1分，编写代码计算n分有几种表示法。(结果可能会很大，你需要将结果模上1000000007)
 * @date : 2020-05-28 14:43
 */
public class Solution2 {
    public static void main(String[] args) {
        int[] coins ={1,5,10,25};
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int res = calc(n, coins);
        System.out.println(res);
    }

    /**
     * 二维解法：
     * dp[i][j] :定义为 i 种硬币组成 j 面值的数量
     * 状态方程： dp[i][j] =dp[i-1][j]+dp[i][j-coins[i]]
     * @param n
     * @param coins
     * @return
     */
    private static int calc(int n, int[] coins) {
        int[][] dp =new int[5][n+1];
        for (int i = 1; i <5 ; i++) {
            dp[i][0] =1;
        }

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(j-coins[i-1]<0){
                    dp[i][j] =dp[i-1][j]%1000000007;
                }else{
                    dp[i][j] =(dp[i-1][j]+dp[i][j-coins[i-1]])%1000000007;
                }
            }
        }
        return dp[4][n];
    }


}
