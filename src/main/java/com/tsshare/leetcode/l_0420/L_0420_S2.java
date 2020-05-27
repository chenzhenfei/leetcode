package com.tsshare.leetcode.l_0420;

import java.util.HashMap;

/**
 * @author chenzhenfei
 * @title: L_0420
 * @projectName leetcode
 * @description: 动态规划 （三角形的最小路径和）https://leetcode-cn.com/circle/article/lxC3ZB/
 * @date 2020/4/2021:42
 * 改用自底向上的方式来递推，即动态规划 （参考 类 L_0420_S1 类中的递归实现）
 */
public class L_0420_S2 {
    /**
     * 解题思路：（我们要求每个节点到底部的最短路径）
     * 从底部找到最优子问题的解，然后向上推 ，找到某个节点一下子问题的最短距离，然后上层的节点就纯依赖下层的最优解，加上自身就是自身节点到底部的最短距离
     * DP状态和状态转移方程
     *  DP 状态：要求每个节点到底部的最短路径,于是 DP 状态 DP[i,j] 定义为 i,j 的节点到底部的最小值
     *  DP 转移方程：DP[i,j] = min(DP[i+1, j], DP[i+1, j+1]) + triangle[i,j]
     *  分析：DP 状态 DP[i,j] 有两个变量，需要分别从下而上，从左到右循环求出所有的 i,j, 有了状态转移方程求出代码就比较简单了
     */
    private static int[][] triangle = {
            {2, 0, 0, 0},
            {3, 4, 0, 0},
            {1, 5, 2, 0},
            {4, 3, 2, 3}
    };

    /**
     *  mini[j] 用来存储对最短，取巧，正常可以定义一个二维数据存储每个几点到底层的最小值
     * @return
     */
   private  static  int traverse(){
       int  row =4;
       // 初始化最小节点为 三角形最低一层，因为最低一层自身就是最短距离
       int[] mini =triangle[row-1];
       // 从倒数第二层一次遍历i,j 进行计算
       for (int i = row-2; i >= 0 ; i--) {
           for (int j = 0; j <triangle[i].length ; j++) {
               if(triangle[i][j]==0){
                    continue;
              }
               mini[j] =triangle[i][j]+Math.min(+mini[j],mini[j+1]);
           }
       }
       return mini[0];
   }


    public static  void main(String[] args)  throws Throwable {
        int traverse = traverse();
        System.out.println("sum = " + traverse);
    }

}
