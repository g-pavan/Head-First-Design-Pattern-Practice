package Subject;

import Observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temparature;
    private float pressure;
    private float humidity;

    public WeatherData(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update();
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public float getTemparature() {
        return temparature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    // For testing in runtime
    public void setMeasuremets(float temparature, float humidity, float pressure){
        this.temparature = temparature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
