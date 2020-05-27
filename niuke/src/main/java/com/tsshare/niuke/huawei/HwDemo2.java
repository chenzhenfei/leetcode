package com.tsshare.niuke.huawei;

import java.util.Scanner;

/**
 * @author chenzhenfei
 * @title: HwDemo1
 * @projectName leetcode
 * @description: TODO
 * @date 2020/5/1920:57
 */
public class HwDemo2 {
        public static void main(String[] arg){
            Scanner scan = new Scanner(System.in);
            String num = scan.nextLine();
            int output =Integer.parseInt(num.substring(2,num.length()),16);
            System.out.println(output);
        }
}
