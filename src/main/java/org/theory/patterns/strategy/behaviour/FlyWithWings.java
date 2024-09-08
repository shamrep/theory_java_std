package org.theory.patterns.strategy.behaviour;

public class FlyWithWings implements Flyable{
    @Override
    public void fly() {
        System.out.println("Flying with wings.");
    }
}
