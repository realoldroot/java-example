package com.zgs.guice;

public class UserServiceImpl implements UserService {

    @Override
    public void process() {

        System.out.println("我需要做一些业务逻辑");
    }
}
