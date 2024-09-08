package org.theory.patterns.strategy.model;

import org.theory.patterns.strategy.behaviour.FlyWithWings;
import org.theory.patterns.strategy.behaviour.Flyable;
import org.theory.patterns.strategy.behaviour.Quackable;
import org.theory.patterns.strategy.behaviour.Sqeack;

public class MallardDuck extends Duck {
    public MallardDuck(Flyable flyable, Quackable quackable) {
        super(flyable, quackable);
    }

    public MallardDuck() {
        super(new FlyWithWings(), new Sqeack());
    }

    @Override
    public void display() {
        System.out.println("I'm a mallard duck.");
    }

}
