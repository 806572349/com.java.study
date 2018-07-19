package com.java.study.proxy.cglib;

/**
 * create by Nemo
 * 2018/7/17  20:21
 */
public class TestGblibProxy {

    //JDK 动态代理是通过接口来强制转化的
    // 生成以后的代理对象可以强制转化为接口

    //CGlib 的动态代理是通过生成一个被代理对象的子类，然后重写父类的方法
    //生成以后的对象，可以强制转化为被代理对象 （也就是自己写的类）
    //子类引用赋值给父类

    public static void main(String[] args) throws Exception {
        Cs cs = (Cs) new GPMeiPo().getInstance(Cs.class);
        cs.findLove();

    }
}
