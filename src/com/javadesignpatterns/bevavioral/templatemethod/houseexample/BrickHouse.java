package com.javadesignpatterns.bevavioral.templatemethod.houseexample;

public class BrickHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Brick by brick, the walls are built! Whoosh!");
    }
}
