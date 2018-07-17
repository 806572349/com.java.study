package com.java.study.proxy.jdk;

/** 代理模式
 * create by Nemo
 * 2018/7/16  17:21
 */
public class XiaoXingXing implements Person {
    private String sex="女";

    private String name="小行星";

    @Override
    public void findLove() {
        System.out.println("我是"+this.name);
        System.out.println("寻找条件");
        System.out.println("高富帅");
        System.out.println("有钱");
        System.out.println("有房");

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
