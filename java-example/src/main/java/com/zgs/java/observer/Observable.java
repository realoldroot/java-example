package com.zgs.java.observer;

import java.util.Vector;

/**
 * 抽象主题角色，Observable：被观察
 */
public abstract class Observable {


    //定义一个观察着数组
    private Vector<Observer> obVector = new Vector<>();

    /**
     * 添加观察者
     *
     * @param observer
     */
    public void addObserver(Observer observer){
        obVector.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    public void removeObserver(Observer observer){
        obVector.remove(observer);
    }

    /**
     * 通知观察者
     *
     * @param obj
     */
    public void notifyObservers(Object obj){
        obVector.forEach(observer -> observer.update(obj));
    }
}
