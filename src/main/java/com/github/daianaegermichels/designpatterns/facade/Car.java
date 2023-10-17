package com.github.daianaegermichels.designpatterns.facade;

/*
* Facade class that provides a unified interface
*
* @author DaianaEgerMichels
 */
public class Car {
    private Engine engine;
    private FuelInjector fuelInjector;
    private Ignition ignition;

    public Car() {
        engine = new Engine();
        fuelInjector = new FuelInjector();
        ignition = new Ignition();
    }

    public void startCar() {
        engine.start();
        fuelInjector.injectFuel();
        ignition.ignite();
        System.out.println("The car was started successfully!");
    }
}
