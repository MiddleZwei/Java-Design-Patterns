package com.javadesignpatterns.structural.decorator;

import com.javadesignpatterns.structural.decorator.beverages.Espresso;
import com.javadesignpatterns.structural.decorator.beverages.Tea;
import com.javadesignpatterns.structural.decorator.condiments.Chocolate;
import com.javadesignpatterns.structural.decorator.condiments.Milk;

public class Main {
    public static void main(String[] args) {
        Beverage espresso1 = new Milk(new Chocolate(new Espresso()));
        espresso1.make();

        System.out.println("\n*********");

        Beverage tea1 = new Milk(new Tea());
        tea1.make();
    }
}
