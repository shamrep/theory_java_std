package org.theory.patterns.solid.srp.correct;

import java.io.FileWriter;
import java.io.IOException;

public class EmployeeFileSaver {
    public void saveToFile(Employee employee, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Employee name: " + employee.getName() + "\n");
            writer.write("Employee salary: " + employee.getSalary() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
