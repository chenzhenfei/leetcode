package com.tsshare.restructure.ratb67;

/**
 * @author chenzhenfei
 * @title: user
 * @projectName leetcode
 * @description: TODO
 * @date 2020/6/90:18
 */
public class User {
    private String userName;
    private int sex;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public User(String userName, int sex) {
        this.userName = userName;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", sex=" + sex +
                '}';
    }
}
