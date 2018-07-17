package com.java.study.classloader;

/**
 * create by Nemo
 * 2018/7/9  10:14
 */
public class Demo {
    public static  int  tmp=1;
    static {
        tmp=2;
        System.out.println(tmp);
    }

    public static void main(String[] args) {
        tmp=3;
        System.out.println(tmp);
    }
}
