package org.theory.patterns.strategy;

import org.theory.patterns.strategy.behaviour.FlyRocketPowered;
import org.theory.patterns.strategy.model.Duck;
import org.theory.patterns.strategy.model.MallardDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.setFlyable(new FlyRocketPowered());
        duck.performFly();
    }
}
