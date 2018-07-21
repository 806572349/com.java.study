package com.java.study.factory.abstra;

import com.java.study.factory.Car;

/**
 * create by Nemo
 * 2018/7/19  21:57
 */
public class DefaultFactory extends AbstracFacory {

    private  AudiFacoty defactory=new AudiFacoty();
    @Override
    protected Car getCar() {

        return defactory.getCar();
    }
}
