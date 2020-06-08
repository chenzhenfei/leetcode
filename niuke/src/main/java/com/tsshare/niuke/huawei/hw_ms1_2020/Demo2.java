package com.tsshare.niuke.huawei.hw_ms1_2020;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenzhenfei
 * @title: Demo2
 * @projectName leetcode
 * @description: TODO
 * @date 2020/6/515:24
 */
public class Demo2 {

    public static void main(String[] args) {

        List<Integer> res =new ArrayList<Integer>();
        int n=100;
        for (int i = 1; i <=n ; i++) {
//            if(calc(n)){
//                res.add(n);}
        }

    }

    public static String calc(List<String> lst){
        int minL=Integer.MAX_VALUE;
        for (int i = 0; i <lst.size() ; i++) {
            minL = Math.min(lst.get(i).length(),minL);
        }
        String pre="";
        boolean b =true;
        for (int j = 0; j < minL ; j++) {
            String a =lst.get(0);
            for (int i = 1; i <lst.size() ; i++) {
                if(lst.get(i).charAt(j)!=a.charAt(j)){
                    b=false;
                    break;
                }
            }
            if(b){
                pre =pre+a.charAt(j);
            }else{
                break;
            }
        }
        return pre;
    }
}
