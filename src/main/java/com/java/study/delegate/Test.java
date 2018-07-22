package com.java.study.delegate;

/**
 * create by Nemo
 * 2018/7/22  22:18
 */
public class Test {

    public static void main(String[] args) {
        Dispatcher dispatcher=new Dispatcher(new ExectorA());

        //看上去好像是经理在干活
        // 实际上干活的人是员工
        // 这就是典型的 干活是我的，功劳时你的

        dispatcher.doing();
    }
}
