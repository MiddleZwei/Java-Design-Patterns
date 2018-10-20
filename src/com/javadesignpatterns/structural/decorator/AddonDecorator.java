package com.javadesignpatterns.structural.decorator;

public class AddonDecorator implements Beverage{

    private Beverage beverage;

    public AddonDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void make() {
        this.beverage.make();
    }
}
