package org.theory.patterns.template_method;

public abstract class CoffeineBeverage {
    public final void prepare() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("Boil water.");
    }

    void pourInCup() {
        System.out.println("Pour in a cup.");
    }

    abstract void brew();

    abstract void addCondiments();


}
