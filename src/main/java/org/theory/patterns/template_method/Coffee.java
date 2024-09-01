package org.theory.patterns.template_method;

public class Coffee extends CoffeineBeverage {
    @Override
    void brew() {
        System.out.println("Brew coffee.");
    }

    @Override
    void addCondiments() {
        System.out.println("Add milk.");
    }
}
