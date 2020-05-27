package com.tsshare.niuke.huawei.hw_2016;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author chenzhenfei
 * @title: QuestionSolution
 * @projectName leetcode
 * @description: 有一个数组a[N]顺序存放0~N-1，要求每隔两个数删掉一个数，
 * 到末尾时循环至开头继续进行，求最后一个被删掉的数的原始下标位置。以8个数(N=7)为例:｛0，1，2，3，4，5，6，7｝，0->1->2(删除)->3->4->5(删除)->6->7->0(删除),如此循环直到最后一个数被删除。
 * @date 2020/5/1922:13
 */
public class QuestionSolution {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num = scan.nextInt();
        int[] an= new int[num];
        List<Integer> listi= new ArrayList<>();

        for (int i = 0; i <num ; i++) {
            an[i]=i;
            listi.add(i);
        }
        Iterator<Integer> iterator = listi.iterator();
        while (iterator.hasNext()){
            iterator.next();

        }
    }
}
