package com.github.daianaegermichels.designpatterns.singleton;

/*
* More use
*
* @author DaianaEgerMichels
* */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder ins = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.ins;
    }
}
