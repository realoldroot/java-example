package com.zgs.java.dynamicproxy;

/**
 * 真实的实现
 */
public class RealSubject implements Subject {

    @Override
    public void work() {

        System.out.println("我是真的在工作");
    }
}
