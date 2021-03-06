package com.zgs.java.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 */
public class DynamicSubject implements InvocationHandler {

    private Object obj;

    public DynamicSubject(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("调用之前 " + method);
        method.invoke(obj, args);
        System.out.println("调用之后" + method);
        return null;
    }
}
