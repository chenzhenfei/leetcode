package com.tsshare.niuke.huawei.hw_ms1_2020;

/**
 * @author chenzhenfei
 * @title: Singiton
 * @projectName leetcode
 * @description: TODO
 * @date 2020/6/514:42
 */
public class Singiton {
    private static Singiton singiton =new Singiton();
    private Singiton(){
    }
    public static Singiton getInstance(){
        return singiton;
    }

}
