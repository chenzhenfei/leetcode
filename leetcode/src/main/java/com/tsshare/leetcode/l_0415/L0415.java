package com.tsshare.leetcode.l_0415;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author chenzhenfei
 * @title: L0415
 * @projectName leetcode
 * @description: 给定一个由 0 和 1 组成的矩阵，找出每个元素到最近的 0 的距离。两个相邻元素间的距离为 1 。
 * @date 2020/4/1522:32
 */
public class L0415 {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[] a1=new int[]{0, 0, 0};
        int[] a2=new int[]{0, 1, 0};
        int[] a3=new int[]{1, 1, 1};
        a[0]=a1;
        a[1]=a2;
        a[2]=a3;
        for (int i = 0; i < 3; i++) {
            System.out.print("\n");
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    System.out.print(a[i][j]);
                } else {
                    System.out.print(a[i][j] + ",");
                }
            }
        }
        int[][] b = updateMatrix(a);
        for (int i = 0; i < 3; i++) {
            System.out.print("\n");
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    System.out.print(b[i][j]);
                } else {
                    System.out.print(b[i][j] + ",");
                }
            }
        }
    }

    public static int[][] updateMatrix(int[][] matrix){
        if(matrix==null){
            return null;
        }
        int lenX = matrix.length;
        int lenY = matrix[0].length;
        int[][] res =new int[lenX][lenY];
        // 定义搜索的方向向量针对矩阵是四个方向
        int[] x_vector =new int[]{1,-1,0,0};
        int[] y_vector =new int[]{0,0,1,-1};
        //建立一个广度搜索的队列
        Queue<int[]> queue =new LinkedList<>() ;
        boolean[][] visited=new boolean[lenX][lenY];
        // 建立广度搜索的源节点，将所有的源节点一次入列
        for (int i = 0; i <lenX ; i++) {
            for (int j = 0; j <lenY ; j++) {
                if(matrix[i][j]==0){
                    queue.offer(new int[]{i,j});
                    visited[i][j] =true;
                }
            }
        }

        // 遍历队列实现广度搜索
        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            int i=poll[0],j=poll[1];
            //分别遍历队列周边的四个方向最近的节点
            for (int k = 0; k <4 ; k++) {
                int dx =i+x_vector[k];
                int dy =j+y_vector[k];
                // 考虑向量越界问题
                if(dx>=0&&dx<lenX&&dy>=0&&dy<lenY&&!visited[dx][dy]){
                    res[dx][dy]=res[i][j]+1;
                    visited[dx][dy] =true;
                    queue.offer(new int[]{dx,dy});
                }
            }
        }
        return res;
    }
}
