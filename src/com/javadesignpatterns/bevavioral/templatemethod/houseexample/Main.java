package com.javadesignpatterns.bevavioral.templatemethod.houseexample;

public class Main {
    public static void main(String[] args) {
        HouseTemplate home = new BrickHouse();
        home.buildHouse();
    }
}
