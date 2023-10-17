package com.github.daianaegermichels.designpatterns.singleton;

/*
 * Using singleton
 *
 * @author DaianaEgerMichels
 */
public class SingletonUse {
    public static void main(String[] args) {
        System.out.println("Singleton Eager");
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);

        System.out.println("Singleton Lazy");
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonLazy lazy2 = SingletonLazy.getInstance();

        System.out.println(lazy == lazy2); // prints true, it reference the same instance

        System.out.println("Singleton Lazy Holder");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
    }
}
