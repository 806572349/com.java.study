package com.java.study.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理
 * create by Nemo
 * 2018/7/16  17:32
 */
public class MeiPo implements InvocationHandler {

    private Person person;
    /**
     * 获取被代理人的个人资料
     * @param target
     * @return
     * @throws Exception
     */
    public Object getInstance(Person target) throws Exception{
        this.person=target;
        Class<? extends Person> aClass = target.getClass();
        System.out.println("被代理对象的class 是："+target.getClass());
        //设置代理对象
        return Proxy.newProxyInstance(aClass.getClassLoader(),aClass.getInterfaces(),this);

    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是媒婆");
        System.out.println("taget:"+this.person.getName()+"sex:"+this.person.getSex());
        System.out.println("开始筛选");
        method.invoke(person,args);

        System.out.println("如果合适，准备开始介绍");

        return null;
    }
}
