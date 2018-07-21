package com.java.study.factory.simplefactory;

import com.java.study.factory.Audi;
import com.java.study.factory.BMW;
import com.java.study.factory.Car;

/**
 * create by Nemo
 * 2018/7/19  21:13
 */
public class SimpleFactory {

    //实现统一管理，专业化管理
    //如果没有工厂模式。
    public Car getCar(String name){
        if ("bmw".equalsIgnoreCase(name)){
            return new BMW();
        }
        if ("Audi".equalsIgnoreCase(name)){
            return new Audi();
        }
        System.out.println("暂无商品");
        return  null;
    }
}
