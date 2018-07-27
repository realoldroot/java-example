package com.zgs.java.staticproxy;

/**
 * 真正的工作实现
 */
public class MyWork implements Work {


    @Override
    public void work(String msg) {
        System.out.println(msg + "工作中");
    }
}
