package com.java.study.singleton;

/**
 * create by Nemo
 * 2018/7/21  14:52
 */

public class Singleton4 {
    private static  class  LazyHolder{
        private static  final Singleton4 Instance=new Singleton4();
    }
    //构造方法私有化
    private Singleton4(){}
    public static final Singleton4 getInstance(){
        return LazyHolder.Instance;
    }

    static {
        //静态块中的内容，只能访问静态属性和静态方法
        //
        //JVM 内容中的静态去，这一块的内容是公共的

    }
}
//类装在到jvm 的过程
// 从上往下

// 类加载过程 顺序
// 先属性 后方法
// 先静态后动态

