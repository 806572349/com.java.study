package com.java.study.factory.abstra;

import com.java.study.factory.BMW;
import com.java.study.factory.Car;
import com.java.study.factory.function.Factory;

/**
 * create by Nemo
 * 2018/7/19  21:41
 */
public class BMWFacoty extends AbstracFacory {
    @Override
    public Car getCar() {
        return new BMW();
    }
}
