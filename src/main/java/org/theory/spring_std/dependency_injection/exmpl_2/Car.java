package org.theory.spring_std.dependency_injection.exmpl_2;

import java.util.List;
import java.util.Map;

public class Car {
    private final String model;
    private final Double price;
    private final List<String> secretCodes;
    private final Map<String, String> repairs;
    private final Engine engine;
    private final Radio radio;

    public Car(String model, Double price, List<String> secretCodes, Map<String, String> repairs, Engine engine, Radio radio) {
        this.model = model;
        this.price = price;
        this.secretCodes = secretCodes;
        this.repairs = repairs;
        this.engine = engine;
        this.radio = radio;
    }
}
