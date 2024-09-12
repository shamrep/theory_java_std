package org.theory.patterns.solid.srp.violation;

import java.io.FileWriter;
import java.io.IOException;

// Single-Responsibility Principle Violating
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

    // Responsibility for saving employee details to a file (I/O operation)
    public void saveToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Employee name: " + name + "\n");
            writer.write("Employee salary: " + salary + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
