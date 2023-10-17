package com.github.daianaegermichels.designpatterns.strategy;

/*
 * Strategy implementation
 *
 * @author DaianaEgerMichels
 */
public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Payment with credit card: $" + amount);
    }
}
