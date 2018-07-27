package com.zgs.guice;

import com.google.inject.AbstractModule;

import javax.inject.Singleton;

public class MyAppModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(LogService.class).to(LogServiceImpl.class).in(Singleton.class);
        bind(UserService.class).to(UserServiceImpl.class).in(Singleton.class);
        bind(Application.class).to(MyApp.class).in(Singleton.class);
    }
}
