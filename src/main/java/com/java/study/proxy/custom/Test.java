package com.java.study.proxy.custom;

import com.java.study.proxy.jdk.MeiPo;
import com.java.study.proxy.jdk.Person;
import com.java.study.proxy.jdk.XiaoXingXing;

/**
 * create by Nemo
 * 2018/7/17  15:38
 */
public class Test {
    public static void main(String[] args) throws Throwable {
        Person obj = (Person) new GPMeiPo().getInstance(new XiaoXingXing());
        System.out.println(obj.getClass());
        obj.findLove();
    }
}
