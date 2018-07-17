package com.java.study.proxy.custom;

import java.lang.reflect.Method;

/**
 *
 *
 * create by Nemo
 * 2018/7/17  15:32
 */
public interface GPInvocvationHandler {

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
