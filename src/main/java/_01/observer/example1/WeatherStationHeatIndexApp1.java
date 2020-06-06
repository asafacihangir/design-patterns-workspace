package _01.observer.example1;

import _01.observer.example1.impl.CurrentConditionsDisplay;
import _01.observer.example1.impl.ForecastDisplay;
import _01.observer.example1.impl.HeatIndexDisplay;
import _01.observer.example1.impl.StatisticsDisplay;
import _01.observer.example1.model.WeatherData;

public class WeatherStationHeatIndexApp1 {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
