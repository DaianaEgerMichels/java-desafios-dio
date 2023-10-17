package com.github.daianaegermichels.designpatterns.singleton;

/*
* The instance is created as soon as the class is created
*
* @author DaianaEgerMichels
 */
public class SingletonEager {
    private static SingletonEager ins = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return ins;
    }
}
