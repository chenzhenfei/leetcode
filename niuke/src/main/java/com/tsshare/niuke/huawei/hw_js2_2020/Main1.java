package com.tsshare.niuke.huawei.hw_js2_2020;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();
        in.close();
        List<List<Integer>> res = calc(s, e);
        if (res == null) {
            System.out.println("NA");
        } else {
            res.forEach(a -> {
                a.forEach(u -> {
                    System.out.print(u + " ");
                });
                System.out.println();
            });
        }

    }

    //先暴力解
    private static List<List<Integer>> calc(int s, int e) {
        if (e - s < 2) {
            return null;
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = s; i <= e - 2; i++) {
            for (int j = i + 1; j <= e - 1; j++) {
                for (int k = j + 1; k <= e; k++) {
                    List<Integer> unit = new ArrayList<>();
                    if ((i * i + j * j == k * k) && hz(i, j, k)) {
                        unit.add(i);
                        unit.add(j);
                        unit.add(k);
                        res.add(unit);
                    }
                }
            }
        }
        return res;
    }

    // 互质：没有公约数
    private static boolean hz(int s, int e, int k) {
        HashMap<Integer,Integer> sm =new HashMap<>();
        HashMap<Integer,Integer> em =new HashMap<>();
        HashMap<Integer,Integer> km =new HashMap<>();
        for (int i = 2; i <=s ; i++) {
            if(s%i==0){
                sm.put(i,i);
            }
        }
        for (int i = 2; i <=e ; i++) {
            if(e%i==0){
                if(sm.containsKey(i)){
                    return false;
                };
                em.put(i,i);
            }
        }
        for (int i = 2; i <=k ; i++) {
            if(k%i==0){
                if(sm.containsKey(i)){
                    return false;
                };
                if(em.containsKey(i)){
                    return false;
                };
            }
        }
        return true;
    }
}
