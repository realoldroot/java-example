package com.zgs.java.observer;

public class ReaderA implements Observer {
    @Override
    public void update(Object obj) {
        System.out.println("我是读者A 我收到了书 :" + obj.toString());
    }
}
