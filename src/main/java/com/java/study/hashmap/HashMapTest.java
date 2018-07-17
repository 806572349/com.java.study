package com.java.study.hashmap;

import java.util.HashMap;

/**
 * create by Nemo
 * 2018/7/7  15:47
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(1,1);
        objectObjectHashMap.put(1,2);
        Object o = objectObjectHashMap.get(1);

        System.out.println(o);

    }
}
