package com.java.study.factory.abstra;

/**
 * create by Nemo
 * 2018/7/19  21:55
 */
public class Test {
    public static void main(String[] args) {
    DefaultFactory defaultFactory=new DefaultFactory();
        String name = defaultFactory.getCar("bwm").getName();
        System.out.println(name);
        //
    }
}
