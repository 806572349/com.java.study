package com.java.study.proxy.custom;

import com.java.study.proxy.jdk.Person;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * create by Nemo
 * 2018/7/17  15:37
 */
public class GPMeiPo implements GPInvocvationHandler {
    private Person person;
    public Object getInstance(Person target) throws Exception{
        this.person=target;
        Class<? extends Person> aClass = target.getClass();
        System.out.println("被代理对象的class 是："+target.getClass());
        //设置代理对象
        return GPPorxy.newProxyInstance(new GPClassLoader(),aClass.getInterfaces(),this);
//            return null;
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
