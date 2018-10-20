package com.javadesignpatterns.bevavioral.strategy;

public class CreditCardPaymentStrategy implements IPaymentMethod {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardPaymentStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println("$"+amount + " paid with credit card/debit card" );
    }
}
