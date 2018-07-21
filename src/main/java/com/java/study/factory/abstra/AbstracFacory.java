package com.java.study.factory.abstra;

import com.java.study.factory.Audi;
import com.java.study.factory.BMW;
import com.java.study.factory.Car;

/**
 * 抽象类
 * create by Nemo
 * 2018/7/19  21:51
 */
public abstract class AbstracFacory {

   protected abstract Car getCar();


    public  Car getCar(String name){
        if ("bmw".equalsIgnoreCase(name)){
            return new BMWFacoty().getCar();
        }
        if ("Audi".equalsIgnoreCase(name)){
            return new AudiFacoty().getCar();
        }
        System.out.println("暂无商品");
        return  null;
    }
}
