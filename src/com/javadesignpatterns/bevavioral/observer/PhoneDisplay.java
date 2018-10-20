package com.javadesignpatterns.bevavioral.observer;

public class PhoneDisplay implements IObserver {

    private String name;
    private WeatherStation station;

    public PhoneDisplay(WeatherStation station, String name) {
        this.name = name;
        this.station = station; // or use a setter method
    }

    @Override
    public void update() {
        int temperature = this.station.getTemperature();
        System.out.println(this.name + " :: Consuming message :: " + temperature + " degrees");
    }
}
