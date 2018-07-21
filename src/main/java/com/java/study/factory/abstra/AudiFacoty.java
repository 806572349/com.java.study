package com.java.study.factory.abstra;

import com.java.study.factory.Audi;
import com.java.study.factory.Car;
import com.java.study.factory.function.Factory;

/**
 * create by Nemo
 * 2018/7/19  21:41
 */
public class AudiFacoty extends AbstracFacory{
    @Override
    public Car getCar() {
        return new Audi();
    }
}
