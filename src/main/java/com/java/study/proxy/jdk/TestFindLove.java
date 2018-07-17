package com.java.study.proxy.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * create by Nemo
 * 2018/7/16  17:30
 */
public class TestFindLove {
    public static void main(String[] args) throws Throwable {
        Person obj = (Person) new MeiPo().getInstance(new XiaoXingXing());

        System.out.println(obj.getClass());
        obj.findLove();
        /**
         * 原理：
         * 1拿到被代理对象的引用吗，然后获取它的接口
         * 2 JDK 代理重新生成一个类，同时实现我们给的代理对象所实现的接口
         * 3 把被代理的对象的引用页拿到了
         * 4 重新动态生成一个class 字节码
         * 5 然后编译
         */
        //获取字节码内容
        byte[] data = ProxyGenerator.generateProxyClass("$Proxy", new Class[]{Person.class});
        FileOutputStream os=new FileOutputStream("$Proxy.class");
        os.write(data);
        os.close();


    }
}
