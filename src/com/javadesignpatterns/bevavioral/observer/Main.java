package com.javadesignpatterns.bevavioral.observer;

public class Main {
    public static void main(String[] args) {
        //create an observable station
        WeatherStation station = new WeatherStation();

        //create observers
        IObserver observer1 = new PhoneDisplay(station, "observer1");
        IObserver observer2 = new PhoneDisplay(station, "observer2");
        IObserver observer3 = new PhoneDisplay(station, "observer3");

        //register observers to the station
        station.add(observer1);
        station.add(observer2);
        station.add(observer3);

        observer1.update();

    }
}
