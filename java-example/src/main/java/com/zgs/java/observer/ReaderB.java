package com.zgs.java.observer;

public class ReaderB implements Observer {
    @Override
    public void update(Object obj) {
        System.out.println("我是读者B 我收到了书 :" + obj.toString());
    }
}
