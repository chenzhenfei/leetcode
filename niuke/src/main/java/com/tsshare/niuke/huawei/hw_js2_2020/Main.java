package com.tsshare.niuke.huawei.hw_js2_2020;

import java.util.*;

/**
 * @author
 * @title: Main
 * @projectName leetcode
 * @description: TODO
 * @date 2020/5/2920:22
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        Set<Long> longSet =new TreeSet<>();
        List<String> list =new ArrayList<>();
        while (n>0&&in.hasNextLine()) {
            String a = in.nextLine();
            if(a.length()==0){
                continue;
            }
            list.add(a);
            n--;
        }
        in.close();
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String v1= o1.substring(o1.length() - 1, o1.length()),v2=o2.substring(o2.length() - 1, o2.length());
                long m = Long.valueOf(o1.substring(0,o1.length() - 1)),m2= Long.valueOf(o2.substring(0,o2.length() - 1));
                long o1L = "M".equals(v1)?m:("G".equals(v1)?m*1000:("T".equals(v1)?m*1000*1000:0)),
                        o2L = "M".equals(v2)?m2:("G".equals(v2)?m2*1000:("T".equals(v2)?m2*1000*1000:0));
                return (int) (o1L-o2L);
            }
        });
        list.forEach(a->{
            System.out.println(a);
        });
    }
}
