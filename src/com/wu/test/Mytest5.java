package com.wu.test;

import java.util.*;

public class Mytest5 {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add(1);
//        list.add(2);
//        for(int i = 0;i < list.size();i++){
//            System.out.println(list.get(i));
//        }
//        Set<String> set = new HashSet();
//        set.add("1111");
//        set.add("222");
//        set.add("3333");
//        set.add("444");
//        set.add("555");
//        set.add("adsfdsfd");
//        for(String abc : set){
//            System.out.println(a);
//        }
//        Integer a = 128;
//        Integer b = 128;
//        System.out.println(a.intValue()==b.intValue());
        Map<String,String> map = new HashMap<>();
        map.put("001","张三");
        map.put("002","李四");
        map.put("003","王五");
        map.put("3","张六");
        System.out.println(map.get("003"));
        Set<String> set = map.keySet();
        for(String c : set){
            System.out.println(c);
        }
    }
}
