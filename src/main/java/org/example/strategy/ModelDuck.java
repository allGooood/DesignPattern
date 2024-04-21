package org.example.strategy;

import org.example.strategy.fly.FlyNoWay;
import org.example.strategy.quack.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리 입니다.");
    }
}
