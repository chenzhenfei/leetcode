package com.tsshare.leetcode.l_0420;

import java.util.HashMap;

/**
 * @author chenzhenfei
 * @title: L_0420
 * @projectName leetcode
 * @description: 递归 （三角形的最小路径和）https://leetcode-cn.com/circle/article/lxC3ZB/
 * 递归原理：https://leetcode-cn.com/explore/orignial/card/recursion-i/256/principle-of-recursion/1101/
 * @date 2020/4/2021:42
 */
public class L_0420_S1 {
    /**
     * 解题思路：
     * 1、所有的路径和，最后再求所有路径和的最小值
     * 2、对于每个节点都可以走它的左或右节点，假设我们定义 traverse(i, j) 为节点 a[i][j] 下一步要走的节点，则可以得出递归公式的伪代码如下
     * 3、traverse(i, j) = {
     *     traverse(i+1, j);    向节点i,j 下面的左节点走一步
     *     traverse(i+1, j+1);    向节点i,j 下面的右节点走一步
     * }
     *
     */

    private static int[][] triangle = {
            {2, 0, 0, 0},
            {3, 4, 0, 0},
            {1, 5, 2, 0},
            {4, 3, 2, 3}
    };

    /**
     * 会存在每个节点交叉的地方存在重复计算
     * 时间复杂度：O(n2)
     * @param i
     * @param j
     * @return
     */
    public static int traverse(int i,int j) {
        // 总行数
        int totalRow=4;
        // 基本案例 -能够不使用递归来产生答案的终止方案。
        if(i>=totalRow-1){
            return 0;
        }
        //能够不使用递归来产生答案的终止方案 -可将所有其他情况拆分到基本案例。
        int ileftSum = traverse(i + 1, j) + triangle[i+1][j];
        int irightSum = traverse(i + 1, j + 1) + triangle[i+1][j+1];
        return Math.min(ileftSum,irightSum);
    }

    /**  时间复杂度 O(n)
     *   空间复杂度 O(n)
     * 优化后的递推，可以减少子问题有重复计算问题 - 递归减枝，通过使用缓存
     * @param i
     * @param j
     * @return
     */
    private static HashMap<String,Integer> map =new HashMap<>();
    public static int traverse_yh(int i,int j) {
        String key =i+""+j;
        if(map.containsKey(key)){
            return map.get(key);
        }
        // 总行数
        int totalRow=4;
        // 基本案例 -能够不使用递归来产生答案的终止方案。
        if(i>=totalRow-1){
            return 0;
        }
        //能够不使用递归来产生答案的终止方案 -可将所有其他情况拆分到基本案例。
        int ileftSum = traverse(i + 1, j) + triangle[i+1][j];
        int irightSum = traverse(i + 1, j + 1) + triangle[i+1][j+1];
        int min = Math.min(ileftSum, irightSum);
        map.put(i+""+j,min);
        return min;
    }


    public static  void main(String[] args)  throws Throwable {
        int minPathSum = traverse(0,0)+triangle[0][0];
        int minPathSum_yh = traverse_yh(0,0)+triangle[0][0];
        System.out.println("sum = " + minPathSum_yh);
    }

}
