package com.javadesignpatterns.bevavioral.observer;

public interface IObservable {
    void add(IObserver o); //register
    void remove(IObserver o); //unregister
    void notifyObservers();
}
