package org.theory.patterns.strategy.behaviour;

public class NoFLy implements Flyable{
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}
