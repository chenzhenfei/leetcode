package com.tsshare.niuke.huawei;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author chenzhenfei
 * @title: HwDemo1
 * @projectName leetcode
 * @description: TODO
 * @date 2020/5/1920:57
 */
public class HwDemo1 {
        public static void main(String[] arg){
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            TreeSet<Integer> treeSet =new TreeSet<Integer>();
            while(num!=0){
                treeSet.add(scan.nextInt());
                num--;
            }
            Iterator<Integer> a =treeSet.iterator();
            while(a.hasNext()){
                System.out.println(a.next());
            }
        }
}
