package com.javadesignpatterns.bevavioral.observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Observer;

public class WeatherStation implements IObservable {

    private List<IObserver> observers = new ArrayList<>();
    private int temperature = 10;

    //register
    @Override
    public void add(IObserver o) {
        if (o == null) throw new NullPointerException("Null Observer");
        if(!observers.contains(o)) this.observers.add(o);
    }

    //unregister
    @Override
    public void remove(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (IObserver o : observers) {
            o.update();
        }
    }


    public int getTemperature() {
        return temperature;
    }
}
