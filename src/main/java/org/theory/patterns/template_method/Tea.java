package org.theory.patterns.template_method;

public class Tea extends CoffeineBeverage {
    @Override
    void brew() {
        System.out.println("Brew tea.");
    }

    @Override
    void addCondiments() {
        System.out.println("Add sugar.");
    }
}
