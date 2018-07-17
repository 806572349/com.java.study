package com.java.study.hashmap;

/**
 * create by Nemo
 * 2018/7/7  16:18
 */
public interface Map<K,V> {
    public  V put(K k,V v);

    V get(K k);

    public  int size();

    public interface  Entry<K,V>{
        K getKey();

        V getValue();

    }
}
