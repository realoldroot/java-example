package com.zgs.java.staticproxy;

public class ProxyTest {

    public static void main(String[] args) {

        Work proxy = new ProxyWork();

        proxy.work("老根");
    }
}
