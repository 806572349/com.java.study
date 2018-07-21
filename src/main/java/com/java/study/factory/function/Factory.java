package com.java.study.factory.function;

import com.java.study.factory.Car;

/**工厂接口 ，定义了所有工厂的执行标准
 * create by Nemo
 * 2018/7/19  21:39
 */
public interface Factory {

    // 符合汽车上路标准
    Car getCar();
}
