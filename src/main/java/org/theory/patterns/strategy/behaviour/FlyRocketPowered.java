package org.theory.patterns.strategy.behaviour;

public class FlyRocketPowered implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flying with a rocket!");
    }
}
