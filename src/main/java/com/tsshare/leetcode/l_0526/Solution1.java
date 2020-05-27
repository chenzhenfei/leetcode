package com.tsshare.leetcode.l_0526;

/**
 * @author chenzhenfei
 * @title: Solution1
 * @projectName leetcode
 * @description: TODO
 * @date 2020/5/260:20
 */
public class Solution1 {
    public static int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int ans = 0;
        // 预处理每一行和每一列
        for (int i = 0; i < m; i++) {
            ans += dp[i][0] = matrix[i][0];
        }
        for (int j = 0; j < n; j++) {
            ans += dp[0][j] = matrix[0][j];
        }
        // 上述过程(0, 0)判断了两次, 如果matrix[0][0] == 1，说明ans多算了一个
        if (matrix[0][0] == 1) {
            ans--;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 1) {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    ans += dp[i][j];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
       int[][]  matrix = new int[][]{
               {0,1,1,1 },{1,1,1,1},{0,1,1,1}};
        int i = countSquares(matrix);
        System.out.println(i);
    }

}
