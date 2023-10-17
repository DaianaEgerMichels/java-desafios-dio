package com.github.daianaegermichels.designpatterns.strategy;

/*
* Context class that uses the strategy
*
* @author DaianaEgerMichels
 */
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
