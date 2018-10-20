package com.javadesignpatterns.structural.decorator.condiments;

import com.javadesignpatterns.structural.decorator.AddonDecorator;
import com.javadesignpatterns.structural.decorator.Beverage;

public class Chocolate extends AddonDecorator {
    public Chocolate(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void make() {
        super.make();
        System.out.println(" :: chocolate ::");
    }
}
