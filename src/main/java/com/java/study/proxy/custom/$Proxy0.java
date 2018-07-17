package com.java.study.proxy.custom;

import java.lang.reflect.Method;

public class $Proxy0 implements com.java.study.proxy.jdk.Person {
    GPInvocvationHandler h;

    public $Proxy0(GPInvocvationHandler h) {
        this.h = h;
    }

    public String getName() {
        try {
            Method m = com.java.study.proxy.jdk.Person.class.getMethod("getName", new Class[]{});
            return (String) this.h.invoke(this, m, null);
        } catch (Exception e) {
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    public String getSex() {
        try {
            Method m = com.java.study.proxy.jdk.Person.class.getMethod("getSex", new Class[]{});
            return (String) this.h.invoke(this, m, null);
        } catch (Exception e) {
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    public void findLove() {
        try {
            Method m = com.java.study.proxy.jdk.Person.class.getMethod("findLove", new Class[]{});
        } catch (Exception e) {
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}