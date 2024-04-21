package org.example;

import org.example.observer.*;
import org.example.strategy.Duck;
import org.example.strategy.MallardDuck;
import org.example.strategy.ModelDuck;
import org.example.strategy.fly.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {

        //#Strategy Pattern
//        Duck mallard = new MallardDuck();
//        mallard.performFly();
//        mallard.performQuack();
//
//        Duck model = new ModelDuck();
//        model.performFly();
//        model.setFlyBehavior(new FlyRocketPowered());
//        model.performFly();

        //#Observer Pattern
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}





















