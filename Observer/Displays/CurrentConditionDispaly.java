package Displays;

import Observer.Observer;
import Subject.WeatherData;

public class CurrentConditionDispaly implements Observer, DisplayElement {

    private float temparature;
    private float humidity;
    private float pressure;

    private WeatherData weatherData;

    public CurrentConditionDispaly(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + weatherData.getTemparature() + "F degrees and " + weatherData.getHumidity() + "% humidity and " + weatherData.getPressure() + " pressure.");
    }

    @Override
    public void update() {
        display();
    }
}
