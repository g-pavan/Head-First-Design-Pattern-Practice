package Displays;

import Observer.Observer;
import Subject.WeatherData;

public class DummyDisplay implements DisplayElement, Observer {
    private WeatherData weatherData;
    public  DummyDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("I'm a dummy display with dont have any data!");
    }

    @Override
    public void update() {
        display();
    }
}
