package _01.observer.example2;

import _01.observer.example2.impl.CurrentConditionsDisplay;
import _01.observer.example2.impl.ForecastDisplay;
import _01.observer.example2.impl.StatisticsDisplay;
import _01.observer.example2.model.WeatherData;

public class WeatherStationMainApp2 {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

}

