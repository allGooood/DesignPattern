package org.example;

import org.example.decorator.*;
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
//        WeatherData weatherData = new WeatherData();
//
//        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
//        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
//
//        weatherData.setMeasurements(80, 65, 30.4f);
//        weatherData.setMeasurements(82, 70, 29.2f);
//        weatherData.setMeasurements(78, 90, 29.2f);


        //#Decoraator Pattern
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}



































