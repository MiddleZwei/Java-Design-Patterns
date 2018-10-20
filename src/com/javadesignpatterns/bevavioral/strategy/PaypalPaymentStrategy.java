package com.javadesignpatterns.bevavioral.strategy;

public class PaypalPaymentStrategy implements IPaymentMethod {

    private String email;
    private String password;

    public PaypalPaymentStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("$"+amount + " paid with PayPal");
    }
}
