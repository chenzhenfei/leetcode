package com.tsshare.restructure.ratb67;

/**
 * @author chenzhenfei
 * @title: TestUser
 * @projectName leetcode
 * @description: 引用对象按值传递 = 可以修改参数得内部状态，但是对参数重新赋值是没有意义的
 * @date 2020/6/90:19
 */
public class Demo2 {
    public static void main(String[] args) {
        User u1 =new User("czf",1);
        updateSex(u1);
        System.out.println(u1.toString());

        User u2 =new User("czf",1);
        replaceUser(u2);
        System.out.println(u2.toString());
    }

    private static void replaceUser(User u2) {
        u2 =new User("czf",0);
        System.out.println(u2.toString());
    }

    private static void updateSex(User u1) {
        u1.setSex(0);
        System.out.println(u1.toString());
    }
}
