package com.java.study.factory.function;

import com.java.study.factory.Audi;
import com.java.study.factory.BMW;
import com.java.study.factory.Car;

/**
 * create by Nemo
 * 2018/7/19  21:41
 */
public class BMWFacoty implements Factory {
    @Override
    public Car getCar() {
        return new BMW();
    }
}
