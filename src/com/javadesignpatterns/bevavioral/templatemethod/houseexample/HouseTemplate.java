package com.javadesignpatterns.bevavioral.templatemethod.houseexample;

public abstract class HouseTemplate {

    //final so subclasses can't override it
    public final void buildHouse(){
        buildWalls();
        buildWindows();
        attachDoors();
        System.out.println("We've just build a house, yaaay!");
    }

    private void buildWindows() {
        System.out.println("Building Windows");
    }

    private void attachDoors(){
        System.out.println("Building doors");
    }

    //will be implemented by subclasses
    public abstract void buildWalls();

}