package com.javadesignpatterns.structural.decorator.beverages;

import com.javadesignpatterns.structural.decorator.Beverage;

public class Espresso implements Beverage {
    @Override
    public void make() {
        System.out.println("Making espresso with ");
    }
}
