package com.github.daianaegermichels.designpatterns.singleton;

/*
* The instance is created when it is still null.
*
* @author DaianaEgerMichels
 */
public class SingletonLazy {
        private static SingletonLazy ins;

        private SingletonLazy() {
            super();
        }

        public static SingletonLazy getInstance() {
            if (ins == null) {
                ins = new SingletonLazy();
            }
            return ins;
        }
}
