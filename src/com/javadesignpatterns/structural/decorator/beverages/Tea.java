package com.javadesignpatterns.structural.decorator.beverages;

import com.javadesignpatterns.structural.decorator.Beverage;

public class Tea implements Beverage {
    @Override
    public void make() {
        System.out.println("Making tea with ");
    }
}
