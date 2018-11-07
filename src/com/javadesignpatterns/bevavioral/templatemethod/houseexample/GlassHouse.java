package com.javadesignpatterns.bevavioral.templatemethod.houseexample;

public class GlassHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("The glass walls are built! Whoosh!");
    }

}
