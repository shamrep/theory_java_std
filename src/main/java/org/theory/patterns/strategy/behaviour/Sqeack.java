package org.theory.patterns.strategy.behaviour;

public class Sqeack implements Quackable {
    @Override
    public void quack() {
        System.out.println("sqeaaack");
    }
}
