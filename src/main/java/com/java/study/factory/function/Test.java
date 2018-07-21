package com.java.study.factory.function;

import com.java.study.factory.Car;

/**
 * create by Nemo
 * 2018/7/19  21:44
 */
public class Test {

    public static void main(String[] args) {
        //工厂方法模式
        // 各自产品的 都拥有各自的工程
        Factory factory=new AudiFacoty();
        //需要用户关心，这个产品的生产商
        Car car = factory.getCar();

        //增加的代码的使用复杂度


        //抽象工厂模式


    }
}
