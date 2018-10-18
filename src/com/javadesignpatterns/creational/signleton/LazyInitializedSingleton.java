package com.javadesignpatterns.creational.signleton;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    //the constructor os private so other classes cannot instantiate the class from other classes
    private LazyInitializedSingleton(){}

    //Lazy approach - create an instance when requested
    private static LazyInitializedSingleton getInstance(){
        if (instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

}
