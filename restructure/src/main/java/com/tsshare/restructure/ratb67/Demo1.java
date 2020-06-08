package com.tsshare.restructure.ratb67;

import java.util.Date;

/**
 * @author chenzhenfei
 * @title: Test0608
 * @projectName leetcode
 * @description: 应用参数赋值
 * @date 2020/6/823:34
 */
public class Demo1 {

    public static void main(String[] args) {
        Date d1 =new Date("1 Apr 98");
        nextDateUpdate(d1);
        System.out.println(d1);

        Date d2 =new Date("1 Apr 98");
        nextDateReplace(d2);
        System.out.println(d2);
    }

    private static void nextDateReplace(Date d2) {
        d2=new Date(d2.getYear(),d2.getMonth(),d2.getDate()+1);
        System.out.println(d2);
    }

    private static void nextDateUpdate(Date d1) {
        d1.setDate(d1.getDate()+1);
        System.out.println(d1);
    }
}
