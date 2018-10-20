package com.javadesignpatterns.bevavioral.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("001", 100);
        Item item2 = new Item("001", 100);
        Item item3 = new Item("001", 100);

        cart.add(item1);
        cart.add(item2);
        cart.add(item3);

        IPaymentMethod paymentMethod = new PaypalPaymentStrategy("email@email.com", "11111"); // don't pass passwords like that lol

        cart.pay(paymentMethod);
    }
}
