package com.zgs.java.staticproxy;

/**
 * 代理工作类
 */
public class ProxyWork implements Work {

    private Work work;

    public ProxyWork(Work work) {
        this.work = work;
    }

    public ProxyWork() {
        this.work = new MyWork();
    }

    @Override
    public void work(String msg) {

        System.out.println("代理工作");

        work.work(msg);

        System.out.println("代理工作结束");
    }


}

