import Displays.CurrentConditionDispaly;
import Displays.DummyDisplay;
import Subject.WeatherData;

public class Clinet {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDispaly currentConditionDispaly = new CurrentConditionDispaly(weatherData);

        // Clinet acts like a weather data sensor
        // When state is changed subject(weatherData) is pushing notification to observer(CurrentConditionDispaly) and observers displaying it
        System.out.println("============================================================");
        weatherData.setMeasuremets(80, 60, 30.4f);
        System.out.println("============================================================");
        weatherData.setMeasuremets(82, 70, 29.0f);
        System.out.println("============================================================");
        weatherData.setMeasuremets(78, 90, 32.8f);

        // Let add observer at runtime
        DummyDisplay dummyDisplay = new DummyDisplay(weatherData);
        System.out.println("============================================================");
        weatherData.setMeasuremets(80, 60, 30.4f);

        weatherData.removeObserver(dummyDisplay);


        System.out.println("============================================================");
        weatherData.setMeasuremets(80, 60, 30.4f);
    }
}
