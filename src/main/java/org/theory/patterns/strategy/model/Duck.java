package org.theory.patterns.strategy.model;

import org.theory.patterns.strategy.behaviour.Flyable;
import org.theory.patterns.strategy.behaviour.Quackable;

public abstract class Duck {
    private Flyable flyable;
    private Quackable quackable;

    public Duck(Flyable flyable, Quackable quackable) {
        this.flyable = flyable;
        this.quackable = quackable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

    public void performQuack() {
        quackable.quack();
    }

    public void performFly() {
        flyable.fly();
    }

    public void swim() {
        System.out.println("All ducks can swim.");
    }

    public abstract void display();
}
