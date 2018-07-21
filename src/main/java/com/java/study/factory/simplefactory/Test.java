package com.java.study.factory.simplefactory;

import com.java.study.factory.Car;

/**
 * create by Nemo
 * 2018/7/19  21:13
 */

public class Test {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Car bmw = simpleFactory.getCar("BMW");
            bmw.getName();
        System.out.println(bmw.getName());

    }
}
