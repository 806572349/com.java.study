package com.java.study.proxy.cglib;

import com.java.study.proxy.jdk.Person;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * gblib
 * create by Nemo
 * 2018/7/17  20:11
 */
public class GPMeiPo implements MethodInterceptor {

    //好像并没有持有被代理对象的引用

    public Object getInstance(Class classs) throws Exception{

        Enhancer enhancer=new Enhancer();
        //把父类设置为
        //这一步就是告诉cglib 生成的子类需要集成哪个来
        enhancer.setSuperclass(classs);

        //设置回调  是为了回调此类中的invoke
        enhancer.setCallback(this);
        // 第一步，生成源代码
        // 第二步，编译成class文件
        //第三步 加载到JVM 中从，并且返回被代理对象
        return enhancer.create();
    }

    //同样是做了一件字节码重组
    //对于使用API 的用户来说是无感知的
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("我是媒婆");
        System.out.println("开始筛选");
        //这个cglib 是cglib 创建出来的
        //cglib new 出来以后的对象，是被代理对象的子类（继承了我们自己写的那个）
        // OOP 在new 子类之前 实际上默认调用了我们super() 方法的；
        // new 子类的同时，必须先new 出来父类，这就相当于间接的持有了哦我们父类的引用
        // 子类重写了父类的所有的方法
        // 我们改变了子类对象的某些属性 是可以简介的操作父类的属性的
        proxy.invokeSuper(obj, args);

        System.out.println("如果合适，准备开始介绍");
        return null;
    }
}
