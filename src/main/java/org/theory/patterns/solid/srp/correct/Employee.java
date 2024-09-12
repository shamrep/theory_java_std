package org.theory.patterns.solid.srp.correct;

import lombok.Getter;

@Getter
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Business logic for employee's salary
    public void giveRaise(double percentage) {
        salary += salary * percentage / 100;
    }
}
