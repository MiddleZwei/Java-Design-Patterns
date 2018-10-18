package com.javadesignpatterns.creational.signleton;

public class EagerInitializedSingleton {

    private final static EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //the constructor os private so other classes cannot instantiate the class from other classes
    private EagerInitializedSingleton(){}

    //Eager approach - create an instance when the object is created
    private static EagerInitializedSingleton getInstance(){
        return instance;
    }

}
