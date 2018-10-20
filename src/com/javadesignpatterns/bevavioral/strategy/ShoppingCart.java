package com.javadesignpatterns.bevavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void add(Item item){
        this.items.add(item);
    }

    public void remove(Item item){
        this.items.remove(item);
    }

    public int getTotal(){
        int sum = 0;
        for (Item i : items){
            sum += i.getPrice();
        }
        return sum;
    }

    public void pay(IPaymentMethod paymentMethod){
        int total = getTotal();
        paymentMethod.pay(total);
    }



}
