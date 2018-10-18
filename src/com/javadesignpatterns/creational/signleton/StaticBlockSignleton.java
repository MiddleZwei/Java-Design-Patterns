package com.javadesignpatterns.creational.signleton;

public class StaticBlockSignleton {

    private static StaticBlockSignleton instance;

    //similar to eager initialization
    static {
        try {
            instance = new StaticBlockSignleton();
        }catch (Exception e){
            throw new RuntimeException("Error creating a singleton instance");
        }
    }

    //the constructor os private so other classes cannot instantiate the class from other classes
    private StaticBlockSignleton() {}

    public static StaticBlockSignleton getInstance(){
        return instance;
    }
}
