package com.tsshare.niuke.huawei;

import java.util.Scanner;

/**
 * @author chenzhenfei
 * @title: HwDemo1
 * @projectName leetcode
 * @description: 链接：https://www.nowcoder.com/questionTerminal/fe298c55694f4ed39e256170ff2c205f
 * 来源：牛客网
 *
 * “某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”答案是5瓶，方法如下：
 * 先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
 * @date 2020/5/1920:57
 */
public class HwDemo3 {
        public static void main(String[] arg){
            Scanner scan = new Scanner(System.in);
           while(scan.hasNext()){
               int n =scan.nextInt();
               System.out.println(drink(n));
           }
        }
        public static int drink(int n){
            if(n==1){
                return 0;
            }else if(n==2){
                return 1;
            }else{
                int h= n/3;
                return h+drink(h+(n-h*3));
            }
        }
}
