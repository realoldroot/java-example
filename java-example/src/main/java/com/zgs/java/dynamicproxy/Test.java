package com.zgs.java.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {

        Subject rs = new RealSubject();

        InvocationHandler handler = new DynamicSubject(rs);

        Class cls = rs.getClass();

        //以下是分解步骤
		/*
		Class c = Proxy.getProxyClass(cls.getClassLoader(), cls.getInterfaces());
		Constructor ct = c.getConstructor(new Class[]{InvocationHandler.class});
		Subject subject =(Subject) ct.newInstance(new Object[]{handler});
		*/

        //以下是一次性生成
        Subject subject = (Subject) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), handler);
        subject.work();
    }
}
