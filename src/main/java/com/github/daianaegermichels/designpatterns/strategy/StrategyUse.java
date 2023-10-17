package com.github.daianaegermichels.designpatterns.strategy;

/*
* Using strategy
*
* @author DaianaEgerMichels
 */
public class StrategyUse {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(350);

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(120);
    }
}
